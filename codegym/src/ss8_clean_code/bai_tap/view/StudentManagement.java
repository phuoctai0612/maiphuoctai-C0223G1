package ss8_clean_code.bai_tap.view;

import ss8_clean_code.bai_tap.controller.StudentController;

public class StudentManagement {

    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.showListStudent();
    }

}
