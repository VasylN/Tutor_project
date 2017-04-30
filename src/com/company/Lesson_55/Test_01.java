package com.company.Lesson_55;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pc on 30.04.2017.
 */
public class Test_01 {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(factorial(i));

    }

    static Map<Integer, BigInteger> cache = new HashMap<>();

    public static BigInteger factorial(int i) {
        BigInteger temp;
        if(i == 0)
            return BigInteger.ONE;
        if ((temp = cache.get(i)) != null)
            return temp;
        temp = BigInteger.valueOf(i).multiply(factorial(i - 1));
        cache.put(i,temp);
        return temp;
    }
}
