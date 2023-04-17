package ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.service;

import ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.model.Teacher;
import ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.repository.TeacherRepositoryImpl;

import java.util.List;
import java.util.Scanner;

public class TeacherServiceImpl implements ITeacherService {
    private TeacherRepositoryImpl teacherRepository = new TeacherRepositoryImpl();
    Scanner sc = new Scanner(System.in);

    @Override
    public void displayTeacher() {

        List<Teacher> teacherList = teacherRepository.getTeacherList();
        for (Teacher t : teacherList) {
            System.out.println(t);
        }
    }

    @Override
    public void addNewTeacher() {
        //public Teacher(int id, String name, String dayOfBirth, boolean gender, String bangCap, String kinhNghiem)
        System.out.println("Nhập id Teacher zô");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên Teacher");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh");
        String dayOfBirth = sc.nextLine();
        System.out.println("1.Nam\n" +
                "2.Nữ");
        String gender = sc.nextLine();
        boolean setGender = true;
        if (gender.equals("1")) {
            setGender = true;
        } else if (gender.equals("2")) {
            setGender = false;
        } else {
            System.out.println("nhập chưa chính xác");
        }
        System.out.println("Nhập bằng cấp");
        String bangCap = sc.nextLine();
        System.out.println("Nhập kinh nghiêm Teacher");
        String kinhNghiem = sc.nextLine();
        Teacher teacher = new Teacher(id, name, dayOfBirth, setGender, bangCap, kinhNghiem);
        teacherRepository.addNewTeacher(teacher);
        System.out.println("Thêm thành công: " + teacher.getName());
        this.displayTeacher();
    }

    @Override
    public void deleteTeacher() {
        this.displayTeacher();
        System.out.println("nhập id bạn muốn xóa");
        int id = Integer.parseInt(sc.nextLine());
        boolean deleteT = teacherRepository.deleteTeacher(id);
        if (deleteT) {
            System.out.println("Đuổi thành công 1 thầy(cô) ra khỏi CodeGym: ");
        } else {
            System.out.println("Hình như không có id thầy đó ở đây");
        }
        this.displayTeacher();
    }
}
