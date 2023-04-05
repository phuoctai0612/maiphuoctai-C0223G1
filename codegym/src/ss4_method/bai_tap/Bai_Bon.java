package ss4_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai_Bon {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(kiemTra(100)));
    }

    public static int[] kiemTra(int num) {
        int a = 0;
        int b = 1;
        int c = 0;
        int count = 0;
        int[] arr = new int[num];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < num; i++) {
            if (c < 100) {
                c = a + b;
                a = b;
                b = c;
                arr[i] = c;
                count++;
            } else {
                break;
            }
        }
        int[] arr1 = new int[count + 1];
        for (int i = 0; i < count + 1; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
}
