package com.denizsalman;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File file = new File("image/foto.jpg");
        System.out.println(file.exists());

    }
}
