package ss4_method.bai_tap;

import java.util.Scanner;

public class Kiem_Tra_Nam_Nhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập năm zô bro");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println(kiemTra(num));
    }

    public static String kiemTra(int num) {
        String str = "";
        if (num % 4 == 0 && num % 100 != 0 || num % 100 == 0 && num % 400 == 0) {
            str = "Năm nhuận ó";
        } else {
            str = "éo phải";
        }
        return str;
    }
}
