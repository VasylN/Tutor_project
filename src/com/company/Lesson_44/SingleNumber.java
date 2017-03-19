package com.company.Lesson_44;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Pc on 12.03.2017.
 */
public class SingleNumber {

    public static void main(String[] args) {
       int[] nums1 = {2, 2, 1, 3, 3};
        System.out.println(singleNumber(nums1));


    }

    public static int singleNumber(int[] nums) {
//        int x = 0;
//        for (int num : nums) {
//            x ^= num;
//        }
//        return x;

//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] != nums[i+1]){
//                return nums[i];
//            }else i++;
//        }
//        return 0;

        int result = 0;
        for (int num : nums) {
            int count = 0;
            for (int i : nums) {
                if(num == i){
                    count++;
                }
            }

            if(count == 1){
                result = num;
            }
        }
        return result;
    }

  /*  public static int singleNumber(int[] nums) {
        List<Integer> integerList = new ArrayList<>();
        int temp;
        // Collections.sort(integerList);
        for (int i = 0; i < nums.length; i++) {
            integerList.add(nums[i]);

        }
        for (Integer integer : nums) {
            for (int i = 0; i < integerList.size(); i++) {
                temp = i;
                i++;
                if (integer ==temp) {
                    integerList.remove(i);
                } else {
                    integerList.add(i);
                }
            }

        }
        return integerList.get(0);

    }*/

}
