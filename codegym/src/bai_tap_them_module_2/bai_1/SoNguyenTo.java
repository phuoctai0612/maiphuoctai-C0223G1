package bai_tap_them_module_2.bai_1;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn kiểm tra bao nhiêu số?");
        int a = Integer.parseInt(sc.nextLine());
        int[] arr = new int[a];
        int tong = 0;

        for (int i = 0; i < a; i++) {
            System.out.println("Nhập số thứ " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                tong += arr[i];
            }else if (arr[i]>2){
                int count=0;
                for (int j = 2; j < Math.sqrt(arr[i]); j++) {
                      if (arr[i]%j==0){
                          count++;
                          break;
                      }
                }
                if (count==0){
                    tong+=arr[i];
                }
            }
        }
        System.out.println(tong);
    }
}
