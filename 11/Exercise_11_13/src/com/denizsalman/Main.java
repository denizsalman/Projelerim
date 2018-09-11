package com.denizsalman;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            int value = input.nextInt();
            if (!list.contains(value))
                list.add(value);
        }

        System.out.println("The distinct integers are: " + list);
    }
}
