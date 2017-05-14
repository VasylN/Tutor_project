package com.company.Lesson_58;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pc on 14.05.2017.
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(factorial(9));
        System.out.println(factorial(5));
    }

    public static Map<Integer, BigInteger> cache = new HashMap<>();

    public static BigInteger factorial(int i) {
        BigInteger temp;
        if (i == 0)
            return BigInteger.ONE;
        if ((temp = cache.get(i)) != null) {
            System.out.println("Cache");
            return temp;
        }
        System.out.println("Not cache");
        temp = BigInteger.valueOf(i).multiply(factorial(i - 1));
        cache.put(i,temp);
        return temp;
    }
}
