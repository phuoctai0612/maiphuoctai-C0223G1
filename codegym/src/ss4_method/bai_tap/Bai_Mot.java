package ss4_method.bai_tap;

import java.util.Scanner;

public class Bai_Mot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so kiem tra");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println(isOdd(num));
    }

    public static String isOdd(int num) {
        String ketQua = "";
        if (num % 2 == 0) {
            ketQua = "chan";
        } else {
            ketQua = "le";
        }
        return ketQua;
    }
}
