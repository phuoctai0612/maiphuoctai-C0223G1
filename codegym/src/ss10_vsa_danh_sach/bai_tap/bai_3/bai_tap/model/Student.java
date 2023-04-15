package src.demo_c0223G1.model;

public class Student extends Person {
    // Mã, tên, ngày sinh, giới tính, lớp, điểm số
    private String classes;
    private double grade;

    public Student() {
        // mac dinh goi constructor cua cha
    }

    public Student(int id, String name, String dayOfBirth, boolean gender, String classes, double grade) {
        super(id, name, dayOfBirth, gender);
        this.classes = classes;
        this.grade = grade;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "classes='" + classes + '\'' +
                ", grade=" + grade +
                '}';
    }
}
