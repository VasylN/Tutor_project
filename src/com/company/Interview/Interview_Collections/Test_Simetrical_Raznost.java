package com.company.Interview.Interview_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Pc on 15.02.2017.
 */
public class Test_Simetrical_Raznost {
    public static void main(String[] args) {
        List<String> strings1 = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
        List<String> strings2 = new ArrayList<>(Arrays.asList("3", "4", "5", "6"));
        Collection<String> result = different(strings1, strings2);
        System.out.println("Collection 1: " + strings1);
        System.out.println("Collection 2: " + strings2);
        System.out.println("Result: " + result);
    }

    public static Collection different(Collection a, Collection b){
        Collection intersection = new ArrayList(a);

        intersection.retainAll(b);
        Collection result = new ArrayList(a);
        result.addAll(b);
        result.removeAll(intersection);
        return result;
    }
}
