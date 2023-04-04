package ss2_ss3_mang_vong_lap.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Xoa_Mang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số cần xóa");
        int numbers=sc.nextInt();
        int []arr={1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            if (numbers==arr[i]){
                for (int j = i; j < arr.length-1; j++) {
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=0;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
