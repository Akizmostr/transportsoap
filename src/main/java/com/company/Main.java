package com.company;

import javax.xml.soap.*;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    private static SOAPMessage createSOAPRequest(String functionName, Map<String, String> parameters) throws Exception
    {
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

        return soapMessage;
    }
}
