package by.bsu2.streams;

public class Student {
    private int id;
    private String name;
    private String surname;

    public Student(int id, String surname, String name) {
        this.id = id;
        this.surname = surname;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
