package com.denizsalman;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Enter five integer for list1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }
        System.out.print("Enter five integer for list2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }

        ArrayList<Integer> listUnion = union(list1, list2);
        System.out.println(listUnion);
    }

    private static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            list.add(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) {
            list.add(list2.get(i));
        }
        return list;
    }
}
