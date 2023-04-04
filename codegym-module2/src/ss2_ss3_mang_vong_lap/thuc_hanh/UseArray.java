package ss2_ss3_mang_vong_lap.thuc_hanh;

import java.util.Scanner;

public class UseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap");
        int n = sc.nextInt();
        int [] arr=new int[n];
        System.out.println("nhap");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            System.out.println(arr[i]);
        }
    }
}
