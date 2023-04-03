package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập năm zô");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Năm nhuận ó");
        }else if (year%100==0&&year%400==0){
            System.out.println("Năm nhuận ó");
        }else {
            System.out.println("không phải năm nhuận");
        }
    }
}
