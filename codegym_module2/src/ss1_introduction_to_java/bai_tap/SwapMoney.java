package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class SwapMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tiền việt");
        double vnd = sc.nextDouble();
        double tongTienAnh = vnd/23000;
        System.out.println("Số tiền đô :"+tongTienAnh);
        System.out.println("Nhập tiền anh");
        double $ = sc.nextDouble();
        double tongTienViet = $*23000;
        System.out.println("Số tiền Việt :"+tongTienViet);
    }
}
