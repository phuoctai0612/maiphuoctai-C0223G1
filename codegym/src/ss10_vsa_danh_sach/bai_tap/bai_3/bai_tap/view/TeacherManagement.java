package ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.view;

import ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.controller.TeacherController;

public class TeacherManagement {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.showTeacherMenu();
    }
}
