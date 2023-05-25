package com.epam.xml.parser;

public enum StudentXmlTag {
  STUDENTS("students"), LOGIN("login"), FACULTY("faculty"), STUDENT("student"), NAME("name"), TELEPHONE("telephone"), COUNTRY("country"), CITY("city"), STREET("street"), ADDRESS("address");
  private String value;

  StudentXmlTag(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

}
