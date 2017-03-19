package com.company.Lesson_38_Binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 05.02.2017.
 */
public class Binary_search {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            } else
                list.add(Integer.parseInt(s));
        }
        Integer [] mas = list.toArray(new Integer[list.size()]);
        System.out.println(binary_search(50, mas));

    }
    public static int binary_search(int val,Integer mas[] ){
        return binary_search(val, mas,0, mas.length );
    }

    public static int binary_search(int val,Integer []mas, int min, int max){
       if(max < min)
        return -1;
        int midle = min + (max - min)/2;
        if(val < mas[midle]){
            return binary_search(val,mas, 0 ,midle);
        }else if(val > mas[midle]){
            return binary_search(val,mas,midle,max );
        }else return midle;
    }
}
