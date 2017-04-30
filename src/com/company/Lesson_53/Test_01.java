package com.company.Lesson_53;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Pc on 19.04.2017.
 * O(n)
 *
 * [8](List el2) [12](List el1, el4) [16](List el3) [] [] [] ...// 16
 *
 *
 * 1 5 10 8
 *//*factorial*/
public class Test_01 {
    public static void main(String[] args) {
        int i = 20;
        System.out.println(factorial(i));

        Collections.synchronizedMap(new HashMap<>());
        new ConcurrentHashMap<>();
    }


    static Map<Integer,BigInteger> cache = new HashMap<Integer, BigInteger>();
    public static BigInteger factorial(int i){
        BigInteger temp;
        if(i == 0){
            return BigInteger.ONE;
        }
        else if((temp = cache.get(i))!= null){
            return temp;

    }temp = BigInteger.valueOf(i).multiply(factorial(i-1));
        cache.put(i,temp);
        return temp;

}}
