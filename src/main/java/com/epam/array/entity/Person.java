package com.epam.array.entity;

import java.util.StringJoiner;

public final class Person {
  private int personId;
  private String name;

  public Person() {
  }
  public Person(int personId, String name) {
    this.personId = personId;
    this.name = name;
  }

  public int getPersonId() {
    return personId;
  }

  public String getName() {
    return name;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person)) return false;

    Person person = (Person) o;

    if (personId != person.personId) return false;
    return name != null ? name.equals(person.name) : person.name == null;
  }

  @Override
  public int hashCode() {
    int result = personId;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
            .add("personId=" + personId)
            .add("name='" + name + "'")
            .toString();
  }
}
