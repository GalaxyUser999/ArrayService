package service;

import java.util.Arrays;

public class ArrayService {
    public static void sortArray (int [] x){
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
    }
    public static void evenUneven(int[] n, boolean isParity) {
        for (int t : n) {
            if (!isParity) {
                if (t % 2 != 0) System.out.println(t);
            } else {
                if (t % 2 == 0) System.out.println(t);
            }
        }
    }


    public static void filtrationArray(int[] k, int number) {
        for (int j : k) {
            if (number < j) System.out.print(j);
        }
    }


    public static void reverseArray(int[] k, boolean reverse) {
        if (reverse) {
            for (int i = k.length - 1; i >= 0; i--) {
                System.out.println(k[i]);
            }
        } else {
            System.out.println(Arrays.toString(k));
        }
    }
}
