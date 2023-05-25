package com.epam.xml.validator;

import java.io.*;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

public class BaseValidatorMain2 {
  static Logger logger = LogManager.getLogger();
  public static void main(String[] args) {
    String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
    String fileName = "dataxml/students.xml";
    String schemaName = "dataxml/students.xsd";
    SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
    File schemaLocation = new File(schemaName);
    try {
// schema creation
      Schema schema = factory.newSchema(schemaLocation);
// creating a schema-based validator
      Validator validator = schema.newValidator();
      Source source = new StreamSource(fileName);
// document check
      validator.setErrorHandler(new StudentErrorHandler());
      validator.validate(source);
    } catch (SAXException | IOException e) {
      System.err.println(fileName + " is not correct or valid. " + e.getMessage());
    }
  }
}
