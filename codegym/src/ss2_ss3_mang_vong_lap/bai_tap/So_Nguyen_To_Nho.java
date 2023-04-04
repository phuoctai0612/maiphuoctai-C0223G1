package ss2_ss3_mang_vong_lap.bai_tap;

import java.util.Scanner;

public class So_Nguyen_To_Nho {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }

    }
}
