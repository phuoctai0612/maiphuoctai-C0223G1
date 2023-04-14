package ss10_vsa_danh_sach.bai_tap.bai_2;

import ss10_vsa_danh_sach.bai_tap.model.Student;

import java.util.Scanner;

public class QuanLy {
    public static void main(String[] args) {
        Student st=new Student();
        Teacher tc=new Teacher();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số để kiểm tra ");
       int ma=sc.nextInt();
       switch (ma){
           case 1:
               System.out.println("nhập mã");
               String ma1= sc.nextLine();
               st.setMa(ma1);

           case 2:
           case 3:
           case 4:
       }
    }
}
