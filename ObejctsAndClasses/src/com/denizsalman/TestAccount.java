package com.denizsalman;

import java.math.BigInteger;
import java.sql.Time;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3),
                new MyPoint(5, 3.5));

        System.out.println("area: "+t1.getArea());
        System.out.println("perimeter: "+t1.getPerimeter());
        System.out.println(t1.contains(new MyPoint(4, 3)));
    }
}
