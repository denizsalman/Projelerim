package com.denizsalman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two sides of the triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        System.out.println("Enter color: ");
        String color = input.next();
        System.out.println("Enter filled: ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(s1, s2, s3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
    }
}
