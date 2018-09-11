package com.denizsalman;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyRectangle2D r = new MyRectangle2D(2, 2, 5.5, 9);
        System.out.println("area: "+r.getArea());
        System.out.println("perimeter: "+r.getPerimeter());
        System.out.println(r.contains(3, 3));
        System.out.println(r.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println(r.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
    }
}
