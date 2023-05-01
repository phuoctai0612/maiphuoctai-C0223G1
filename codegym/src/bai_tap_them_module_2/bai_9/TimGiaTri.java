package bai_tap_them_module_2.bai_9;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 dãy số");
        String a = sc.nextLine();
        String[] b = a.split("");
        String temp;
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = i; j < b.length; j++) {
                if (Integer.parseInt(b[i])>Integer.parseInt(b[j])) {
                    temp = b[j];
                    b[j]=b[i];
                    b[i]=temp;
                }
            }
        }
        String c=b[b.length-1];
        for (int i = 0; i < b.length; i++) {
            if (b[i].equals(c)){
                count++;
            }
        }
        System.out.println("Số lớn nhì là "+b[b.length-(count+1)]);
    }
}
