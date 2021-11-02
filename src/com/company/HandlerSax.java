package com.company;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class HandlerSax extends DefaultHandler {
    String name = null;
    Boolean bChildren = false;
    Boolean bChild = false;
    String child = null;
    String slash;
    private StringBuilder currentValue = new StringBuilder();
    private StringBuilder stroka = new StringBuilder();
//        @Override
//        public void startDocument() {
//            System.out.println("Start Document");
//        }

//        @Override
//        public void endDocument() {
//            System.out.println("End Document");
//        }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {

        // reset the tag value
        currentValue.setLength(0);


        if (qName.equalsIgnoreCase("children") && bChildren == false) {
            bChildren = true;
//                System.out.println(bChildren);
        } else if ((qName.equalsIgnoreCase("children") && bChildren == true)) {
//                System.out.println(bChildren);
        }

        if (qName.equalsIgnoreCase("child") && attributes.getValue("is-file").equals("true")) {
            bChild = true;
//                System.out.println(bChild);
        } else if (qName.equalsIgnoreCase("child") && attributes.getValue("is-file").equals("false")) {
            bChild = false;
//                System.out.println(bChild);
        }

    }


    @Override
    public void endElement(String uri,
                           String localName,
                           String qName) {

        if (qName.equalsIgnoreCase("children") && bChildren == true) {
            bChildren = false;
//                System.out.println(bChildren);
        } else if ((qName.equalsIgnoreCase("children") && bChildren == false)) {
//                System.out.println(bChildren);
        }


        if (qName.equalsIgnoreCase("name")) {
            if (currentValue.toString().equals("/")) {
                slash = currentValue.toString();
            }
//            stroka.append(slash);
            if (qName.equalsIgnoreCase("name") && bChildren == true && bChild == true) {
                stroka.append(slash);

                Integer nacalo = stroka.length();

                stroka.append(currentValue);

                Integer konec = stroka.length();
                System.out.printf("Название : %s%n", stroka.toString());
                stroka.delete(nacalo-1, konec);
            } else if (qName.equalsIgnoreCase("name") && bChildren == true && bChild == false) {
                stroka.append(slash);
                stroka.append(currentValue);
            }

        }
    }

    @Override
    public void characters(char ch[], int start, int length) {

        currentValue.append(ch, start, length);

    }

}
