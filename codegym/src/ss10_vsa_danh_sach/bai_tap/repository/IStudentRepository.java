package ss10_vsa_danh_sach.bai_tap.repository;

import ss10_vsa_danh_sach.bai_tap.model.Student;

import java.util.List;

public interface IStudentRepository {
        List<Student> getStudentList();

        void addNewStudent(Student student);

        boolean deleteStudentById(int id);
}
