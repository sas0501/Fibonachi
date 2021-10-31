package com.company;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

    public class HandlerSax extends DefaultHandler {

        private StringBuilder currentValue = new StringBuilder();
        String file;
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

//                if (qName.equalsIgnoreCase("child")&& attributes.getValue("is-file")=="true") {
                if (qName.equalsIgnoreCase("child")) {
                file= attributes.getValue("is-file");
                }

//                    System.out.println("%s%n",qName);



                // get tag's attribute by index, 0 = first attribute
//            String currency = attributes.getValue(0);
//            System.out.printf("Name :%s%n", attributes.getValue(0));


//            System.out.printf("Start Element : %s%n", qName);

//            if (qName.equalsIgnoreCase("child")) {
//                // get tag's attribute by name
//                String id = attributes.getValue("is-file");
//                System.out.printf("Child is-file: %s%n", attributes.getValue("is-file"));
//            }



        }

        @Override
        public void endElement(String uri,
                               String localName,
                               String qName) {

//            System.out.printf("End Element : %s%n", qName);

//            if (qName.equalsIgnoreCase("name")) {
//                System.out.printf("Name : %s%n", currentValue.toString());
//            }
//
//            if (qName.equalsIgnoreCase("role")) {
//                System.out.printf("Role : %s%n", currentValue.toString());
//            }

            if (qName.equalsIgnoreCase("name")) {
                System.out.printf("%s", currentValue.toString());

            }

            if ((qName.equalsIgnoreCase("name"))&& (file=="true")) {
                System.out.printf("Название : %s", currentValue.toString());
                file="false";
            }
//
//            if (qName.equalsIgnoreCase("bio")) {
//                System.out.printf("Bio : %s%n", currentValue.toString());
//            }

        }

        // http://www.saxproject.org/apidoc/org/xml/sax/ContentHandler.html#characters%28char%5B%5D,%20int,%20int%29
        // SAX parsers may return all contiguous character data in a single chunk,
        // or they may split it into several chunks
        @Override
        public void characters(char ch[], int start, int length) {

            // The characters() method can be called multiple times for a single text node.
            // Some values may missing if assign to a new string

            // avoid doing this
            // value = new String(ch, start, length);

            // better append it, works for single or multiple calls
            currentValue.append(ch, start, length);

        }

    }
