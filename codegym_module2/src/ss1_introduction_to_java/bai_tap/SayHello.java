package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên bạn zô");
        String Name = sc.nextLine();
        System.out.println("Hello :"+Name);
    }
}
