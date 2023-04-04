package ss2_ss3_mang_vong_lap.bai_tap;

import java.util.Scanner;

public class Hien_Thi_So_Nguyen_To {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng các số nguyên tố cần kiểm tra");
        int numbers = sc.nextInt();
        int count = 0;
        for (int i = 2; i > 1; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.println(i);
            }
            if (count == numbers) {
                break;
            }
        }
    }
}

