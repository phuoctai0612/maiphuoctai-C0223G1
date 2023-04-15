package ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.view;

import ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.controller.StudentController;

public class CodeGymManagement {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.showStudentMenu();
    }
}
