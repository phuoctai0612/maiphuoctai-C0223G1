package ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.controller;

import ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.service.StudentServiceImpl;

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
                    studentService.addNewStudent();
                    break;
                case "2":
                    studentService.deleteStudent();
                    break;
                case "3":
                    studentService.displayStudentList();
                    break;
                case "0":
                    flag = false;
                    System.out.println("Thoat quan ly sinh vien.");
                    break;
                default:
                    System.out.println("Ban chon chua dung chuc nang!");
            }
        } while (flag);
    }
}
