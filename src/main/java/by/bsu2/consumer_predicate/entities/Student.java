package by.bsu2.consumer_predicate.entities;

import java.util.Map;

public class Student {
    private String firstName;
    private String lastName;
    private Map<String, Integer> mark;

    public Student(String firstName, String lastName, Map<String, Integer> mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Map<String, Integer> getMark() {
        return mark;
    }

    public void expelledStudent() {
        System.out.println("Student " + firstName + " " + lastName + " expelled.");
    }

    public void addMark(String subjectName, Integer subjectMark) {
        mark.put(subjectName, subjectMark);
    }


    public boolean isBadMark() {
        for (String subject : mark.keySet()) {
            if (mark.get(subject) < 4) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", mark=").append(mark);
        sb.append('}');
        return sb.toString();
    }


}
