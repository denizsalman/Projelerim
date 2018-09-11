package com.denizsalman;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        BigInteger a = new BigInteger(Long.MAX_VALUE+"");
        boolean isPrime = false;
        while (count < 5) {
            isPrime = true;
            for (BigInteger i = new BigInteger("2");
                 a.multiply(BigInteger.valueOf(2)).compareTo(i) > 0;
                 i = i.add(BigInteger.valueOf(1))) {
                 if (a.remainder(i).compareTo(BigInteger.valueOf(0)) == 0 ) {
                     isPrime = false;
                     break;
                 }
            }
            if (isPrime) {
                System.out.println(a);
                count++;
            }
            a = a.add(BigInteger.valueOf(1));

        }

    }
}
