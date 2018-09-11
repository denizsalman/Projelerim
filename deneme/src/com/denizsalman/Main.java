package com.denizsalman;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SimpleCircle[] circles = new SimpleCircle[3];
        circles[0] = new SimpleCircle(1, "white", true);
        circles[1] = new SimpleCircle(2, "Red", true);
        circles[2] = new SimpleCircle(3, "Yellow", true);

        ArrayList<SimpleCircle> circles1 = new ArrayList<>(Arrays.asList(circles));
        circles1.add(new SimpleCircle(1, "Green", true));
        System.out.println(circles[0]);
        System.out.println(circles1.get(0));




    }

}
