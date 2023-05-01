package bai_tap_them_module_2.bai_5;

import java.util.Scanner;

public class TongSo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số kiểm tra");
        int b=sc.nextInt();
        int index=0;
        int index1=0;
        int[] a={1,2,3,4,5,6,7,8,9,10,11,25,53,32};

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] + a[j] == b){
                    index=i;
                    index1=j;
                    break;
                }
            }
        }
        System.out.println("Vị trí thứ nhất là: "+index+" và vị trí thứ 2 là: "+index1 );
    }
}
