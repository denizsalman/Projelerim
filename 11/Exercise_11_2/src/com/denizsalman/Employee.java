package com.denizsalman;

import java.util.Date;

public class Employee extends Person {
    private String office;
    private double salary;
    private Date date;

    public Employee() {

    }

    public Employee(String name, String address, String phone, String email, String office, double salary) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.date = new Date();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEmployee Class" +
                "\noffice: " + office +
                "\nsalary: " + salary +
                "\ndate: " + date;
    }
}
