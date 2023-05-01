package bai_tap_them_module_2.bai_3;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int count = 0;
        int b = 0;
        int c = 1;
        int d;
        int[] arr = new int[20];
        arr[0] = b;
        arr[1] = c;
        for (int i = 2; i < 20; i++) {
            if (count < 100) {
                count += arr[i - 1];
                d = b + c;
                b = c;
                c = d;
                arr[i] = d;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
