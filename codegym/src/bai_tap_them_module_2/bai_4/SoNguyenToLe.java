package bai_tap_them_module_2.bai_4;

import java.util.Arrays;

public class SoNguyenToLe {
    public static void main(String[] args) {
        int[] a = new int[20];
        int[] b = {1, 2, 4, 5, 8, 7, 15, 55, 30, 99};

        for (int i = 0; i < b.length; i++) {
            int count = 0;
            if (b[i] == 2) {
                a[i] = b[i];
                continue;
            }
            for (int j = 2; j < Math.sqrt(b[i]); j++) {
                if (b[i] % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                a[i] = b[i];
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
