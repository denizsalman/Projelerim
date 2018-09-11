package com.denizsalman;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(100);
        list.add(9);
        System.out.println(max(list));


    }

    public static Integer max(ArrayList<Integer> list) {
        if (list.size() == 0) {
            return null;
        }
        Collections.sort(list);
        return list.get(list.size() - 1);
    }
}
