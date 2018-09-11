package com.denizsalman;

import java.util.Date;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty() {

    }

    public Faculty(String name, String address, String phone, String email, String office,
                   double salary, String officeHours, String rank) {
        super(name, address, phone, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nFaculty Class" +
                "\noffice hours: " + officeHours +
                "\nrank: " + rank;
    }
}
