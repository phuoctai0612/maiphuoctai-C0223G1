package ss8_clean_code.bai_tap.controller;

import ss8_clean_code.bai_tap.service.IStudentService;
import ss8_clean_code.bai_tap.service.StudentService;

public class StudentController {

    private IStudentService iStudentService
            = new StudentService();

    public void showListStudent(){
        iStudentService.showListStudent();
    }

}
