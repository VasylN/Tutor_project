package com.company.Lesson_06_List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 28.09.2016.
 */
public class Test_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        while(true){
            String a = reader.readLine();
            if(a.isEmpty()) break;
            list.add(Integer.parseInt(a));
        }
        for (int i = 0; i < list.size() ; i++) {
            Integer x = list.get(i);
            if( x%2 == 0){
                even.add(x);
            }else{
                odd.add(x);
            }
        }
        for (int i = 0; i < even.size(); i++) {
            System.out.println(even.get(i));
        }
        System.out.println();

        for (int i = 0; i < odd.size(); i++) {
            System.out.println(odd.get(i));
        }
    }

}
