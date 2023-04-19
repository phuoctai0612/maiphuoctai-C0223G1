package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class InsertSortPlus {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int max = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > max; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = max;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 7, 8, 4, 6, 3, 54};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
