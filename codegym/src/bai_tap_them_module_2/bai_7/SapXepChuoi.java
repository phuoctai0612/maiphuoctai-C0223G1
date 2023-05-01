package bai_tap_them_module_2.bai_7;

import java.util.Arrays;
import java.util.Scanner;

public class SapXepChuoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi");
        String a=sc.nextLine();
        String []b=a.split("");
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
    }
}
