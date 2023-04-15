package ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.service;

import ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.model.Student;
import ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.repository.StudentRepositoryImpl;
import ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.service.IStudentService;

import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements IStudentService {
    Scanner scanner = new Scanner(System.in);
    private StudentRepositoryImpl studentRepository = new StudentRepositoryImpl();

    @Override
    public void displayStudentList() {
        List<Student> studentList = studentRepository.getStudentList();
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    @Override
    public void addNewStudent() {

        System.out.print("Nhap id sinh vien: ");
        int studentId = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap ten sinh vien: ");
        String studentName = scanner.nextLine();
        System.out.print("Nhap ngay sinh vien: ");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Chon gioi tinh \n" +
                "1. Nam \n" +
                "2. Nu \n");
        boolean gender = false;
        String chooseGender = scanner.nextLine();
        if (chooseGender.equals("1")) {
            gender = true;
        } else if (chooseGender.equals("2")) {
            gender = false;
        }
        System.out.print("Nhap lop cua sinh vien: ");
        String classes = scanner.nextLine();
        System.out.print("nhap diem cua sinh vien: ");
        double grade = Double.parseDouble(scanner.nextLine());
        Student newStudent = new Student(studentId, studentName, dayOfBirth, gender, classes, grade);
        studentRepository.addNewStudent(newStudent);
        System.out.println("them moi thanh cong sinh vien " + newStudent.getName());
        this.displayStudentList();
    }

    @Override
    public void deleteStudent() {
        this.displayStudentList();
        System.out.println("chon id sinh vien can xoa: ");
        int idStudentDelete = Integer.parseInt(scanner.nextLine());
        boolean isDeleted = studentRepository.deleteStudentById(idStudentDelete);
        if (isDeleted) {
            System.out.println("ban da xoa thanh cong");
            this.displayStudentList();
        } else {
            System.out.println("khong tim thay");
        }
    }
}
