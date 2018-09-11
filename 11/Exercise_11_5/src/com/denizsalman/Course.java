package com.denizsalman;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public void dropStudent(String student) {
        students.remove(student);
    }

    public String  getStudents() {
        return students.toString();
    }

    public int numberOfStudents() {
        return students.size();
    }
 }
