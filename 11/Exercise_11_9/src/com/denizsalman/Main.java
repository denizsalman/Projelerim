package com.denizsalman;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();

        System.out.print("Enter the array size n:");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];
        createRandomMatrix(matrix);
        printMatrix(matrix);
        findLargestRow(matrix, rows);
        findLargestCol(matrix, cols);
        System.out.println(rows);
        System.out.println(cols);

        int max  = findMax(rows);
        System.out.print("The largest row index: ");
        for (int i = 0; i < rows.size(); i++) {
            if (max == rows.get(i))
                System.out.print(i + ", ");
        }

        System.out.println();
        max  = findMax(cols);
        System.out.print("The largest col index: ");
        for (int i = 0; i < cols.size(); i++) {
            if (max == cols.get(i))
                System.out.print(i + ", ");
        }


    }

    private static int findMax(ArrayList<Integer> rows) {
        int max = rows.get(0);
        for (int i = 0; i < rows.size(); i++) {
            if (max < rows.get(i))
                max = rows.get(i);
        }
        return max;
    }

    private static void findLargestCol(int[][] matrix, ArrayList<Integer> cols) {
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }
            cols.add(count);
        }
    }

    private static void findLargestRow(int[][] matrix, ArrayList<Integer> rows) {
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            rows.add(count);
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void createRandomMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
    }
}
