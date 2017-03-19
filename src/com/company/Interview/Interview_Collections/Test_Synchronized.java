package com.company.Interview.Interview_Collections;

import java.util.*;

/**
 * Created by Pc on 12.02.2017.
 *
 */
public class Test_Synchronized {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        Collections.synchronizedList(list);
        Collections.synchronizedMap(map);
        Collections.synchronizedSet(set);
    }
}
