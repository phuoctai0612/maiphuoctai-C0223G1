package ss4_plus_class_object.thuc_hanh;

import java.util.Scanner;

public class Hinh_Chu_Nhat {
    double width,height;
    public Hinh_Chu_Nhat(){
    }
    public Hinh_Chu_Nhat(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double dienTich(){
        return this.height*this.width;
    }
    public double chuVi(){
        return (this.width+this.height)*2;
    }
    public static class Main{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("");
            double width=sc.nextDouble();
            System.out.println("");
            double height=sc.nextDouble();
            Hinh_Chu_Nhat chuNhat=new Hinh_Chu_Nhat(width,height);
            System.out.println(chuNhat.dienTich());
            System.out.println(chuNhat.chuVi());

        }
    }
}

