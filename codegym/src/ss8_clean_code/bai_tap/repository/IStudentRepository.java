package ss8_clean_code.bai_tap.repository;

import ss10_vsa_danh_sach.bai_tap.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> showListStudent();
}
