package ss10_vsa_danh_sach.bai_tap.view;

import ss10_vsa_danh_sach.bai_tap.controller.StudentController;
public class StudentManagement {
    public static void main(String[] args) {
        StudentController studentController=new StudentController();
        studentController.showStudentMenu();
    }
}
