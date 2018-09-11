package com.denizsalman;

public class Student extends Person {
    public final static String FRESHMAN = "freshman";
    public final static String SOPHOMORE = "sophomore";
    public final static String JUNIOR = "junior";
    public final static String SENIOR = "senior";
    public String status;

    public Student() {

    }

    public Student(String name, String address, String phone,
                   String email, String status) {
        super(name, address, phone, email);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Student Class" +
                "\n status: " + status;
    }
}
