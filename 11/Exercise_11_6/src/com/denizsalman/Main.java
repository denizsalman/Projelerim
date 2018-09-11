package com.denizsalman;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(new Circle());
        arrayList.add(new Loan());
        arrayList.add(new Date());

        System.out.println(arrayList.get(0).toString());
        System.out.println(arrayList.get(1).toString());
        System.out.println(arrayList.get(2).toString());
    }
}
