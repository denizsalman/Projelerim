package com.denizsalman;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "10000000000000000000000000000000000000000000" +
                "000000";
        BigInteger a = new BigInteger(s);
        int count = 0;
        while (count < 10) {
            if (a.remainder(new BigInteger("2")).compareTo(BigInteger.valueOf(0)) == 0 ||
                    a.remainder(new BigInteger("3")).compareTo(BigInteger.valueOf(0)) == 0) {
                System.out.println(a);
                count++;
            }
            a = a.add(BigInteger.valueOf(1));
        }
    }
}
