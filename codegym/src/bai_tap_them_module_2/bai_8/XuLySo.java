package bai_tap_them_module_2.bai_8;

import java.util.Scanner;

public class XuLySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 dãy sô");
        int a = Integer.parseInt(sc.nextLine());
        int soDau;
        int soCuoi = 0;
        for (int i = 0; i < a; i++) {
            soDau = a % 10;
            a /= 10;
            soCuoi = soCuoi * 10 + soDau;

        }
        System.out.println(soCuoi);
    }
}
