package ss2_ss3_mang_vong_lap.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Tim_Uoc_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số cần tìm ước");
        int num = Integer.parseInt(sc.nextLine());
        int[] count = new int[num];
        int index = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count[index] = i;
                index++;
            }
        }

        int[] count1 = new int[index];

        for (int i = 0; i < index; i++) {
            count1[i] = count[i];
        }
        System.out.println(Arrays.toString(count1));
        int max = count1[0];
        for (int j = 0; j < index; j++) {
            if (count1[j] > max) {
                max = count1[j];
            }
        }
        System.out.println(max);
    }
}
