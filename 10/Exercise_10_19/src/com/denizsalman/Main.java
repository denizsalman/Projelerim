package com.denizsalman;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BigInteger a = new BigInteger("2");
        System.out.println(a.pow(2));
        while (a.compareTo(BigInteger.valueOf(100)) < 0) {
            if (isPrime(a)) {
                BigInteger b = BigInteger.valueOf(2);
                if (isPrime(b.pow(a.intValue()).subtract(BigInteger.valueOf(1)))) {
                    System.out.println(a+", "+b.pow(a.intValue()).subtract(BigInteger.valueOf(1)));
                }
            }
            a = a.add(BigInteger.valueOf(1));
            System.out.println(a);
        }
    }

    public static boolean isPrime(BigInteger a) {
        for (BigInteger i = new BigInteger("2");
             a.divide(BigInteger.valueOf(2)).compareTo(i) >= 0; i = i.add(BigInteger.valueOf(1))) {
            if (a.remainder(i).compareTo(BigInteger.valueOf(0)) == 0) {
                return false;
            }
        }
        return true;
    }
}
