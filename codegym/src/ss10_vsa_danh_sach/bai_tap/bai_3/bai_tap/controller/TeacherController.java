package ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.controller;

import ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.model.Teacher;
import ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.service.TeacherServiceImpl;

import java.util.Scanner;

public class TeacherController {
    private TeacherServiceImpl teacherService=new TeacherServiceImpl();
    public void showTeacherMenu(){
        Scanner sc=new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("---------Quản lý các teacher ở CodeGym---------\n" +
                    "1.Thêm mới teacher\n" +
                    "2.Kích teacher khỏi CodeGym\n" +
                    "3.Hiển Thị Teacher\n" +
                    "0.Thoát khỏi Menu\n" +
                    "Mời bạn chọn chức năng");
            String chose= sc.nextLine();
            switch (chose){
                case "1":
                    teacherService.addNewTeacher();
                    break;
                case "2":
                    teacherService.deleteTeacher();
                    break;
                case "3":
                    teacherService.displayTeacher();
                    break;
            }
        }while (flag);
    }
}
