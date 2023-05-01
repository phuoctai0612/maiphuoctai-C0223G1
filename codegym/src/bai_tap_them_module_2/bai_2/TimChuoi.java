package bai_tap_them_module_2.bai_2;

import java.util.Arrays;
import java.util.Scanner;

public class TimChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần tìm");
        String a = sc.nextLine();
        String[] arr = a.split("");
        for (int i = 0; i < arr.length; i++) {
            String arr1 = arr[i];
            int count = 0;
            if (!arr[i].equals("")) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr1.equals(arr[j])) {
                        count++;
                        arr[j] = "";
                    }
                }
                System.out.println(arr1 + " xuất hiện " + count + " lần");
            }
        }  System.out.println(Arrays.toString(arr));
    }
}

