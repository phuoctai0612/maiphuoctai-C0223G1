package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class UseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //khai báo đối tượng Scanner bằng biến sc
        System.out.println("Nhập chiều cao : ");
        float width = sc.nextFloat();
        System.out.println("Nhập chiều rộng : ");
        float height = sc.nextFloat();
        float area = width * height;
        System.out.println("diện tích hcn là : " + area);
    }
}
