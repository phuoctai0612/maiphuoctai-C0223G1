package ss10_vsa_danh_sach.bai_tap.controller;

import ss10_vsa_danh_sach.bai_tap.service.StudenServiceImlp;

import java.util.Scanner;

public class StudentController {
    private  StudenServiceImlp studenServiceImlp=new StudenServiceImlp();
    public  void showStudentMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("----Quan  ly ---- \n" +
                    "1. Them moi nhan vien \n" +
                    "2. Xoa nhan vien \n" +
                    "3. Xem danh sach nhan vien \n" +
                    "0. Thoat\n" +
                    "Moi ban chon chuc nang: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    studenServiceImlp.showMenuStudent();
                    break;
                case "0":
                    flag = false;
                    System.out.println("Thoat quan ly sinh vien.");
                default:
                    System.out.println("Ban chon chua dung chuc nang!");
            }
        } while (flag);
    }
}

