package ss8_clean_code.bai_tap.repository;

 import ss8_clean_code.bai_tap.model.Student;

 import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static Student[] students;
    static {
        students = new Student[5];
        Student s = new Student("A","C@gmail.com");
        Student s2 = new Student("B","V@gmail.com");
        Student s3 = new Student("C","N@gmail.com");
        students[0] = s;
        students[1] = s2;
        students[2] = s3;
    }

    @Override
    public List<Student> showListStudent() {
        for (Student s : students){
            if(s == null){
                break;
            }
            System.out.println(s);
        }
        return null;
    }

}
