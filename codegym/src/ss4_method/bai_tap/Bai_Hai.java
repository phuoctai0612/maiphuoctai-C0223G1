package ss4_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai_Hai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số cần tìm ước");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println(Arrays.toString(timUoc(num)));
    }

    public static int[] timUoc(int num) {
        int number = 0;
        int[] arr = new int[num];
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                arr[number] = i;
                number++;
            }
        }
        int[] arr1 = new int[number];
        for (int j = 0; j < number; j++) {
            arr1[j] = arr[j];
        }
        return arr1;
    }
}
