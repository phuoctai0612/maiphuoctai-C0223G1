package ss2_ss3_mang_vong_lap.bai_tap;

import java.util.Scanner;

public class Hien_Thi_Hinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số để in hình");
        int numbers = sc.nextInt();
        switch (numbers) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            case 2:
                for (int i = 1; i < 6; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 3:
                for (int i = 6; i > 1; i--) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 4:
                for (int i = 1; i < 4; i++) {
                    for (int j = 1; j < 6; j++) {
                        if (j <= 3 - i || j >= 3 + i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
        }
    }
}
