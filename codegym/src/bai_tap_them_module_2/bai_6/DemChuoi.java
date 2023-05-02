package bai_tap_them_module_2.bai_6;

import java.util.Scanner;

public class DemChuoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String b="mai phuoc tai";
        System.out.println("Nhập chữ muốn tìm trong chuỗi");
        char t=sc.nextLine().charAt(0);
        int count=0;
        for (int i = 0; i < b.length() ; i++) {
           if (b.charAt(i)==t){
               count++;
           }
        }
        System.out.println(t+" xuất hiện "+count+" lần");
    }
}
