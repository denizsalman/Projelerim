package com.denizsalman;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyStack myStack = new MyStack();
        myStack.add(2);
        myStack.add(3);
        myStack.add("r");

        System.out.println(myStack.pop());
        myStack.push(6);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
    }
}
