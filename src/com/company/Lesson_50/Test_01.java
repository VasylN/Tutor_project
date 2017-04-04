package com.company.Lesson_50;

/**
 * Created by Pc on 29.03.2017.
 */
public class Test_01 {
    public static void main(String[] args) {
        int mas[] = {6, 7, 3, 8};
        //nextLarger(a) = [7, 8, 8, -1]
        for (int ma : nextLarger(mas)) {
            System.out.println(ma);
        }

    }

    public static int[] nextLarger(int[] a) {
        int mas[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] < a[j]) {
                    mas[i] = a[j];
                    break;
                } else {
                    mas[i] = -1;
                }
            }
        }

        return mas;
    }
    /*int[] nextLarger(int[] a) {
        int[] s = new int[a.length];
        int S = 0;
        for (int i = a.length-1; i >=0 ; --i) {
            while (S > 0 && a[i] > s[S-1]) S--;
            int t = S>0 ? s[S-1] : -1;
            s[S++] = a[i];
            a[i] = t;
        }
        return a;
    }*/
}
