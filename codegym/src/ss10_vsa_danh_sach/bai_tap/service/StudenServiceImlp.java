package ss10_vsa_danh_sach.bai_tap.service;

import ss10_vsa_danh_sach.bai_tap.model.Student;
import ss10_vsa_danh_sach.bai_tap.repository.StudentRepositoryIplm;

import java.util.List;
import java.util.Scanner;

public class StudenServiceImlp implements IStudentService {
    Scanner sc=new Scanner(System.in);
    private StudentRepositoryIplm studentRepository=new StudentRepositoryIplm();

    @Override
    public void showMenuStudent() {
        List<Student> studentList=studentRepository.getStudentList();
        for (Student s: studentList) {
            System.out.println(s);
        }
    }
}
