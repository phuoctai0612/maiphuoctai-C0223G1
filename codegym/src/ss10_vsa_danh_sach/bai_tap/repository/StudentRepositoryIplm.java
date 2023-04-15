package ss10_vsa_danh_sach.bai_tap.repository;

import ss10_vsa_danh_sach.bai_tap.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryIplm implements IStudentRepository {
        private static ArrayList<Student> studentList = new ArrayList<>();

        static {
            studentList.add(new Student("1","Quy","1999",true, "C0223G1", 10));
            studentList.add(new Student("2","Tai","1988",true, "C0223G1", 10));
            studentList.add(new Student("3","Vu","1977",true, "C0223G1", 10));
            studentList.add(new Student("4","Tinh","1966",true, "C0223G1", 10));
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
            // duyet list, tim thay thi xoa, return true
            // nguoc lai return false.
            return false;
        }
    }
