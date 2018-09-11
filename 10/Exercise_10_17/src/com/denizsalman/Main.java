package com.denizsalman;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BigInteger a = new BigInteger(String.valueOf(Long.MAX_VALUE));
        int count = 0;
        long longValue = (long) Math.sqrt(Long.MAX_VALUE);
        System.out.println(longValue);
        while (count < 10) {
            System.out.println(a);
            a = new BigInteger(String.valueOf(longValue++)).multiply(BigInteger.valueOf(longValue++));
            count++;
        }
    }
}
