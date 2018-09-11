package com.denizsalman;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Deniz Salman");
        course1.addStudent("Ahmet Kaya");
        course1.addStudent("Neşet Ertaş");

        course2.addStudent("Mahir Çayan");
        course2.addStudent("İbrahim Kayapakkaya");

        course1.dropStudent("Deniz Salman");
        System.out.println("Number of students in course1: " + course1.numberOfStudents());
        System.out.println(course1.getStudents());

        System.out.println("Number of students in course2: " + course2.numberOfStudents());
        System.out.println(course2.getStudents());

     }
}
