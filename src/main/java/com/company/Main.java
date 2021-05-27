package com.company;

import javax.xml.soap.*;
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
            // calling the function_getCarsList () to get the car registration number
            SOAPMessage soapResponseCarList = soapConnection.call(soapRequestCarList, url);

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
