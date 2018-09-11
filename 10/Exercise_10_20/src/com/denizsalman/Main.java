package com.denizsalman;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BigDecimal p = new BigDecimal("1");
        for (int i = 100; i < 1000; i += 100) {
            BigDecimal e = new BigDecimal("1");
            for (int j = 1; j <= i; j++) {
                e = e.add(p.divide(fac(j), 24, BigDecimal.ROUND_UP));
            }
            System.out.println(e);
        }
    }

    public static BigDecimal fac(int i) {
        BigDecimal mul = new BigDecimal("1");
        for (int j = 1; j <= i; j++) {
            mul = mul.multiply(BigDecimal.valueOf(j));
        }
        return mul;
    }
}