package ss13_thuat_toan_tim_kiem.bai_tap.tim_kiem_nhi_phan_su_dung_de_quy;

import java.util.Arrays;
import java.util.Scanner;

public class LookingForBinary {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("nhập số lượng phần từ của mảng");
        int count = sc.nextInt();
        int[] strings = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("nhập phần tử thứ: " + i);
            int giaTri = sc.nextInt();
            strings[i] = giaTri;
        }
        int temp = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i] > strings[j]) {
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(strings));
        System.out.println("vị trí của phần tử cần tìm là: "+binarySearch(strings,0, strings.length-1,7));
    }

    public static int binarySearch(int[] array, int left, int right, int value) {

        int middle = (left + right) / 2;
        if (middle>1) {
            if (array[middle] == value) {
                return middle;
            }
            if (value > array[middle]) {
                return binarySearch(array, middle + 1, right, value);
            }
            if (value < array[middle]) {
                return binarySearch(array, left, middle - 1, value);
            }
        }
        return -1;
    }
}
