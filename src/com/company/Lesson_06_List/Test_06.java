package com.company.Lesson_06_List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 28.09.2016.
 */
public class Test_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        while (true){
            String a = reader.readLine();
            if(a.isEmpty()) break;
            int x = Integer.parseInt(a);
            if(x%2 == 0){
                list.add(x);
            }else {
                list.add(0,x);
            }

        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }

}
