package ss2_ss3_mang_vong_lap.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Tinh_Tong_Duong_Cheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số hàng");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số cột");
        int m = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(i + "," + j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            tong += arr[i][i];
        }
        System.out.println(tong);

    }
}
