package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Student> listStudents = new ArrayList<Student>();
        // add students to list
        listStudents.add(new Student("Tài", 5, "Huế"));
        listStudents.add(new Student("Hoa", 19, "Hanoi"));
        listStudents.add(new Student("Phu", 20, "Hanoi"));
        listStudents.add(new Student("Quy", 22, "Hanoi"));
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return ((Integer)o2.getAge()).compareTo(((Integer)o1.getAge()));
            }
        });
        for (Student t: listStudents) {
            System.out.println(t);
        }
    }
}
