package com.denizsalman;

import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Circle cirle1 = new Circle();
        System.out.println(cirle1.getArea());
        cirle1.setRadius(4);
        System.out.println(cirle1.getArea());
    }

}

class Circle {
    double radius;

    Circle() {
        radius = 1;
    }

    Circle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}


