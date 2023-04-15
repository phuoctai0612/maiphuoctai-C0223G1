package src.demo_c0223G1.repository;

import src.demo_c0223G1.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getStudentList();

    void addNewStudent(Student student);

    boolean deleteStudentById(int id);
}
