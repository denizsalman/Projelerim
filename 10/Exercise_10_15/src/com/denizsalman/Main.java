package com.denizsalman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];

        System.out.print("Enter five points: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        MyRectangle2D r = getRectangle(points);
        System.out.println("The bounding rectangle's center " +
                "("+r.getX()+", "+r.getY()+"), width "+r.getWidth()+"," +
                "height "+r.getHeight());
    }

    public static MyRectangle2D getRectangle(double[][] points) {
        MyRectangle2D r = new MyRectangle2D();
        double minX, minY, maxX,maxY;
        minX =  maxX = points[0][0];
        minY = maxY = points[0][1];
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] < minX) {
                minX = points[i][0];
            }
            if (points[i][1] < minY) {
                minY = points[i][1];
            }
            if (points[i][0] > maxX) {
                maxX = points[i][0];
            }
            if (points[i][1] > maxY) {
                maxY = points[i][1];
            }
        }
        r.setWidth(maxX - minX);
        r.setHeight(maxY - minY);
        r.setX(minX + r.getWidth() / 2);
        r.setY(minY + r.getHeight() / 2);
        return r;
    }
}
