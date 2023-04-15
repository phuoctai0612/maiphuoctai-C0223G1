package src.demo_c0223G1.controller;

import src.demo_c0223G1.service.StudentServiceImpl;

import java.util.Scanner;

public class StudentController {
   private StudentServiceImpl studentService = new StudentServiceImpl();
    public void showStudentMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {

        System.out.print("----Quản lý học viên---- \n" +
                "1. Thêm mới học viên \n" +
                "2. Xoá học viên \n" +
                "3. Xem danh sách học viên \n" +
                "0. Thoát \n" +
                "Mời chọn chức năng: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                // them moi.
                studentService.addNewStudent();
                break;
            case "2":
                // xoa
                break;
            case "3":
                studentService.displayStudentList();
                // xem danh sach
                break;
            case "0":
                flag = false;
                System.out.println("Thoat quan ly sinh vien.");
                // thoat
            default:
                System.out.println("Ban chon chua dung chuc nang!");
        }
        } while (flag);
    }
}
