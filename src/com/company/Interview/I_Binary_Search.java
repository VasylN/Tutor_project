package com.company.Interview;

/**
 * Created by Pc on 25.01.2017.
 * log(N)
 */
public class I_Binary_Search {
    public static void main(String[] args) {
        int[] arr = {13, 24,54,3,5,45,67,3,45,11,333};

        System.out.println(searchBinary(23, arr));
    }

    private static int searchBinary(int val, int[] arr) {
        return searchBinary(val, arr, 0, arr.length-1);
    }

    private static int searchBinary(int val, int[] arr, int lo, int hi) {
        if(lo > hi) return -1;

        int mid = lo + (hi - lo) / 2;

        if(val < arr[mid]){
            return searchBinary(val, arr, 0, mid - 1);
        } else if(val > arr[mid]){
            return searchBinary(val, arr, mid + 1, hi);
        } else return mid;
    }
}
