package by.bsu2.streams;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int id;
    private int number;
    private int course;
    //private List<Student> studentsList;
    private List<Student> groupA;
    private List<Student> groupB;

    public Group(int id, int number, int course) {
        this.id = id;
        this.number = number;
        this.course = course;
        //this.studentsList = new ArrayList<>();
        groupA = new ArrayList<>();
        groupB = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public int getCourse() {
        return course;
    }

    public List<Student> getGroupA() {
        return groupA;
    }

    public List<Student> getGroupB() {
        return groupB;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    /*public void addStudent(Student student){
        studentsList.add(student);
    }*/

    public void addToAGroup(Student student) {
        groupA.add(student);
    }

    public void addToBGroup(Student student) {
        groupB.add(student);
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", number=" + number +
                ", course=" + course +
                // ",\n studentsList=" + studentsList +
                ",\n groupA=" + groupA +
                ",\n groupB=" + groupB +
                '}';
    }
}
