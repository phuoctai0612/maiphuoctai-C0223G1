package ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.controller;

import ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.service.StudentServiceImpl;
import ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.service.TeacherServiceImpl;

import java.util.Scanner;

public class CodeGymController {
    private StudentServiceImpl studentService = new StudentServiceImpl();
    private TeacherServiceImpl teacherService = new TeacherServiceImpl();

    public void showStudentMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("--------Quản lý CodeGym---------\n" +
                    "1. Quản lý học sinh\n" +
                    "2. Quản lý Teacher\n" +
                    "0. Out\n" +
                    "Mời bạn chọn");
            String codeGymManagement = scanner.nextLine();
            switch (codeGymManagement) {
                case "1":
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
                    break;
                case "2":
                    do {
                        System.out.println("---------Quản lý các teacher ở CodeGym---------\n" +
                                "1.Thêm mới teacher\n" +
                                "2.Kích teacher khỏi CodeGym\n" +
                                "3.Hiển Thị Teacher\n" +
                                "0.Thoát khỏi Menu\n" +
                                "Mời bạn chọn chức năng");
                        String chose = scanner.nextLine();
                        switch (chose) {
                            case "1":
                                teacherService.addNewTeacher();
                                break;
                            case "2":
                                teacherService.deleteTeacher();
                                break;
                            case "3":
                                teacherService.displayTeacher();
                                break;
                            default:
                                System.out.println("Bạn đã thoát khỏi quản lý Teacher");
                        }
                    } while (flag);
                    break;
                case "0":
                    System.out.println("bạn đã thoát");
                    flag = false;
                    break;
                default:
                    System.out.println("k có lựa chọn này");
            }
        } while (flag);

    }
}
