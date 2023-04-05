package ss4_method.bai_tap;

import java.util.Scanner;

public class Bai_Nam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số để kiểm tra");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println(kiemTra(num));
    }

    public static boolean kiemTra(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
