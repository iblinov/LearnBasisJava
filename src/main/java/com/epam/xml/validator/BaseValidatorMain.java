package com.epam.xml.validator;

import java.io.*;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;


import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.w3c.dom.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

public class BaseValidatorMain {
  static Logger logger = LogManager.getLogger();
  public static void main(String[] args) {
    String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
    String fileName = "dataxml/students.xml";
    String schemaName = "dataxml/students.xsd";
 //   SchemaFactory factory = SchemaFactory.newInstance(language);
    File schemaLocation = new File(schemaName);
    try {
      SchemaFactory schemaFactory = SchemaFactory.newInstance(language);
      Schema schema = schemaFactory.newSchema(new File("dataxml/students.xsd"));
      Validator validator = schema.newValidator();
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document document = builder.parse(fileName);
      validator.validate(new DOMSource(document));
// schema creation
   //   Schema schema = factory.newSchema(schemaLocation);
// creating a schema-based validator
    //  Validator validator = schema.newValidator();
    //  Source source = new StreamSource(fileName);
// document check
    //  validator.setErrorHandler(new StudentErrorHandler());
    //  validator.validate(source);
      logger.info("fine end");
    } catch (SAXException | IOException | ParserConfigurationException e) {
     logger.error(fileName + " is not correct or valid. " + e.getMessage());
    }
  }
}
