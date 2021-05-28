package com.company;

import jakarta.xml.soap.*;
import org.w3c.dom.NodeList;


import java.util.HashMap;
import java.util.Map;


public class Main {
    // login data
    private static final String KODF = "martinkolek";
    private static final String USERNAME = "asstra";
    private static final String PASS = "asstra1";

    public static void main(String[] args) {
	// write your code here

        try{
            // create a connection for SOAP
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // calling parameters of function_getCarsList ()
            Map<String, String>parametersCarList = new HashMap<>();
            parametersCarList.put("kodf", KODF);
            parametersCarList.put("username", USERNAME);
            parametersCarList.put("pass", PASS);
            // SOAP server URL
            String url = "https://api.webdispecink.cz/code/WebDispecinkServiceNet.php?wsdl";

            // create a request with parameter for calling the function _getCarsList ()
            SOAPMessage soapRequestCarList = createSOAPRequest("_getCarsList", parametersCarList);
            // calling the function_getCarsList ()
            SOAPMessage soapResponseCarList = soapConnection.call(soapRequestCarList, url);

            // Print the SOAP Response
            System.out.println("Response SOAP Message:");
            soapResponseCarList.writeTo(System.out);
            System.out.println();

            // get response body - tag content <SOAP-ENV:Body>
            SOAPBody responseCarList = soapResponseCarList.getSOAPBody();
            // element <ns1:_getCarsListResponse>
            Node getAllCarsPositionResponse = (Node) responseCarList.getFirstChild();
            // element <return>
            Node returnContent = (Node) getAllCarsPositionResponse.getFirstChild();

            NodeList items = returnContent.getChildNodes();

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

        /* Print the request message, just for debugging purposes */
        System.out.println("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println("\n");

        return soapMessage;
    }
}
