package com.optionexample.main;

/**
 * Created by Ihar_Blinou on 12/22/2015.
 */
public class Abonent {
    private int id;
    private int phone;
    private String name;

    public Abonent(int id, int phone, String name ) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }


    public boolean equalsWithoutId(Abonent o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Abonent abonent = (Abonent) o;
        if (phone != abonent.phone) return false;
        return name != null ? name.equals(abonent.name) : abonent.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + phone;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", phone=" + phone +
                ", name='" + name + '\'' +
                '}';
    }
}
