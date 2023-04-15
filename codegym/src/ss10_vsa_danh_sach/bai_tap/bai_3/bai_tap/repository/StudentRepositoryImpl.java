package ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.repository;

import ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.model.Student;

import java.util.ArrayList;
import java.util.List;


public class StudentRepositoryImpl implements IStudentRepository {

    private static ArrayList<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1, "Quy", "1999", true, "C0223G1", 10));
        studentList.add(new Student(2, "Tai", "1988", true, "C0223G1", 10));
        studentList.add(new Student(3, "Vu", "1977", true, "C0223G1", 10));
        studentList.add(new Student(4, "Tinh", "1966", true, "C0223G1", 10));
    }

    @Override
    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public void addNewStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public boolean deleteStudentById(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId()==id) {
                studentList.remove(i);
                return true;
            }
        }
        return false;
    }
}

