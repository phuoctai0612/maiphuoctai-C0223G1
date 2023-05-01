package bai_tap_them_module_2.bai_6;

import java.util.Scanner;

public class DemChuoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String b="maiphuoctai";
        String []a=b.split("");
        System.out.println("Nhập chữ muốn tìm trong chuỗi");
        String c= sc.nextLine();
        int count=0;
        for (int i = 0; i < a.length ; i++) {
           if (a[i].equals(c)){
               count++;
           }
        }
        System.out.println(c+" xuất hiện "+count+" lần");
    }
}
