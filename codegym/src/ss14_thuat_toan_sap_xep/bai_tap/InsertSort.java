package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử");
        int index = Integer.parseInt(sc.nextLine());
        int[] arr = new int[index];
        for (int i = 0; i < index; i++) {
            System.out.println("nhập phần tử thứ: " + i);
            int count = Integer.parseInt(sc.nextLine());
            arr[i] = count;
        }
        System.out.println("Mảng đầu tiên: "+Arrays.toString(arr));
        for (int i = 1; i < arr.length ; i++) {
            int key = arr[i];
            System.out.println(" gán giá trị key = "+arr[i]);
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                System.out.println("Tìm thấy key = "+key+ " bé hơn "+arr[j]);
                arr[j + 1] = arr[j];
                System.out.println("Đổi giá trị của arr[i] là : "  + " = "+ arr[j]);
                System.out.println("Chạy mảng thứ: "+ (i)+" " +Arrays.toString(arr));
            }
            arr[j + 1] = key;
            System.out.println("Thoát khỏi vòng lặp j và gán giá trị: "+Arrays.toString(arr));
        }
        System.out.println("Mảng hoàn chỉnh: "+Arrays.toString(arr));
    }
}
