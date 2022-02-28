package com.fibonachi;

import java.math.BigInteger;

public class Fibonachi {

    public static void main(String[] args) {
        // Fibonacci v cikle
        BigInteger num0 = BigInteger.valueOf(0);
        BigInteger num1 = BigInteger.valueOf(1);
        BigInteger num2;
        System.out.print(num0 + " " + num1 + " ");
        for (int i = 3; i <= 100; i++) {
            num2 = num0.add(num1);
            System.out.print(num2 + " ");
            num0 = num1;
            num1 = num2;
        }
        // Rekursia
        System.out.println();
        BigInteger num=BigInteger.valueOf(0);
        BigInteger i = BigInteger.valueOf(20);
        for (; num.compareTo(i) <= 0;) {
            num=num.add(BigInteger.ONE);
            System.out.print(fibonachi(num) + " ");
        }
    }
    public static BigInteger fibonachi(BigInteger num) {

        if (num.compareTo(BigInteger.ONE) <= 0) {
            return BigInteger.ZERO;
        } else if (num.compareTo(BigInteger.TWO) == 0) {
            return BigInteger.ONE;
        } else {
            return fibonachi(num.subtract(BigInteger.ONE)).add(fibonachi(num.subtract(BigInteger.TWO)));
        }
    }
}