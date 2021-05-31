package com.company;

import jakarta.xml.soap.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    // login data
    private static final String KODF = "martinkolek";
    private static final String USERNAME = "asstra";
    private static final String PASS = "asstra1";
    static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Map<Integer, Car> cars = new HashMap<>();

        try{
            // create a connection for SOAP
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // calling parameters of function_getCarsList ()
            Map<String, String> parametersCarList = new HashMap<>();
            parametersCarList.put("kodf", KODF);
            parametersCarList.put("username", USERNAME);
            parametersCarList.put("pass", PASS);
            // SOAP server URL
            String url = "https://api.webdispecink.cz/code/WebDispecinkServiceNet.php?wsdl";

            // create a request with parameter for calling the function _getCarsList ()
            SOAPMessage soapRequestCarList = createSOAPRequest("_getCarsList", parametersCarList);
            // calling the function _getCarsList ()
            SOAPMessage soapResponseCarList = soapConnection.call(soapRequestCarList, url);

            logSOAPMessage(soapResponseCarList, "Response SOAP Message:");

            Node returnContent = getReturnContent(soapResponseCarList);

            NodeList items = returnContent.getChildNodes();

            for(int i = 0; i < items.getLength(); i++){
                Node item = (Node) items.item(i);
                Car car = new Car();
                if (item.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) item;
                    car.setId(Integer.parseInt(element.getElementsByTagName("carid").item(0).getTextContent()));
                    car.setIdentifier(element.getElementsByTagName("identifikator").item(0).getTextContent());
                    car.setDisabled(Integer.parseInt(element.getElementsByTagName("disabled").item(0).getTextContent()));
                    car.setType(Integer.parseInt(element.getElementsByTagName("type").item(0).getTextContent()));
                }
                cars.put(car.getId(), car);
            }

            SOAPMessage soapRequestCarsPosition = createSOAPRequest("_getAllCarsPosition", parametersCarList);
            SOAPMessage soapResponseCarsPosition = soapConnection.call(soapRequestCarsPosition, url);
            logSOAPMessage(soapResponseCarsPosition, "Response SOAP Message:");

            returnContent = getReturnContent(soapResponseCarsPosition);

            items = returnContent.getChildNodes();

            for(int i = 0; i < items.getLength(); i++) {
                Node item = (Node) items.item(i);
                if (item.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) item;
                    int id = Integer.parseInt(element.getElementsByTagName("carid").item(0).getTextContent());
                    Car car = cars.get(id);
                    if(car != null){
                        car.setLatitude(Float.parseFloat(element.getElementsByTagName("latitude").item(0).getTextContent()));
                        car.setLongitude(Float.parseFloat(element.getElementsByTagName("longitude").item(0).getTextContent()));
                        car.setSpeed(Integer.parseInt(element.getElementsByTagName("speed").item(0).getTextContent()));
                        car.setLocation(element.getElementsByTagName("Location").item(0).getTextContent());
                    }
                }
            }
            soapConnection.close();

            CarRepository carRepo = new CarRepository();

            for (Map.Entry<Integer, Car> entry : cars.entrySet())
            {
                Car car = entry.getValue();
                carRepo.updateCar(car);
                /*float latitude = car.getLatitude();
                float longitude = car.getLongitude();
                String identifier = car.getIdentifier();
                if(car.getDisabled() == 0)
                    System.out.printf("%s %f %f%n", identifier, latitude, longitude);*/
            }

            List<Car> cars1 = new ArrayList<>();

            cars1 = carRepo.findAllCars();
            for (Car car :
                    cars1) {
                System.out.println(car);
            }
        }
        catch(Exception e){
            System.err.println("Error occurred while handling SOAP Request.");
            e.printStackTrace();
        }
    }

    private static SOAPMessage createSOAPRequest(String functionName, Map<String, String> parameters) throws Exception{
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();

        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement(functionName);

        // adding parameters
        for (Map.Entry<String, String> entry : parameters.entrySet())
        {
            String key = entry.getKey();
            String value = entry.getValue();
            SOAPElement paramKodf = soapBodyElem.addChildElement(key);
            paramKodf.addTextNode(value);
        }

        soapMessage.saveChanges();

        logSOAPMessage(soapMessage, "Request SOAP Message:");

        return soapMessage;
    }

    private static void logSOAPMessage(SOAPMessage soapMessage, String hint){
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        try {
            soapMessage.writeTo(bout);
            String message = bout.toString(StandardCharsets.UTF_8);
            log.info(hint + "\n" + message + "\n");
        } catch (SOAPException | IOException e) {
            e.printStackTrace();
        }
    }

    private static Node getReturnContent(SOAPMessage soapMessage){
        SOAPBody responseBody;
        Node returnContent = null;
        try {
            responseBody = soapMessage.getSOAPBody();
            // element <ns1:_soapAction>
            Node soapActionNode = (Node) responseBody.getFirstChild();
            //element <return>
            returnContent = (Node) soapActionNode.getFirstChild();
        } catch (SOAPException e) {
            e.printStackTrace();
        }
        return returnContent;
    }

}
