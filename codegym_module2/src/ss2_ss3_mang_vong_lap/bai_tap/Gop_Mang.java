package ss2_ss3_mang_vong_lap.bai_tap;

import java.util.Arrays;

public class Gop_Mang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = new int[arr.length + arr1.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
            for (int j = 0; j < arr1.length; j++) {
                arr2[j + arr.length] = arr1[j];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
