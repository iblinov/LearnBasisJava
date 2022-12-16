package com.epam.learn.entity;

/**
 * The type Person.
 */
public abstract class Person {
  private int personId;
  private String lastname;

  /**
   * Instantiates a new Person.
   *
   * @param personId the person id
   * @param lastname the lastname
   */
  public Person(int personId, String lastname) {
    this.personId = personId;
    this.lastname = lastname;
  }

  /**
   * Eq boolean.
   *
   * @param lastname the lastname
   * @return the boolean
   */
  boolean eq(String lastname) {
    return this.lastname != null ? this.lastname.equals(lastname) : this.lastname == lastname;
  }
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("{");
    sb.append("personId=").append(personId);
    sb.append(", lastname='").append(lastname).append('\'');
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {

    if (this == o) return true;
    if (o == null) return false;
    if (getClass() != o.getClass()) return false;
    Person person = (Person) o;
    if (personId != person.personId) return false;
    return lastname != null ? lastname.equals(person.lastname) : person.lastname == null;
  }

  @Override
  public int hashCode() {
    int result = personId;
    result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
    return result;
  }
}
