package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class SimpleEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("a :");
        a=sc.nextDouble();
        System.out.println("b :");
        b=sc.nextDouble();
        System.out.println("c :");
        c=sc.nextDouble();
        if (a!=0){
            double request=(c-b)/a;
            System.out.println("request :"+request);
        }else {
            if (b==0){
                System.out.println("The sulution is a1 x!");
            }else {
                System.out.println("No sulution");
            }
        }
    }
}
