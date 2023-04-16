package ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.view;

import ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.controller.CodeGymController;

public class CodeGymManagement {
    public static void main(String[] args) {
        CodeGymController studentController = new CodeGymController();
        studentController.showStudentMenu();
    }
}
