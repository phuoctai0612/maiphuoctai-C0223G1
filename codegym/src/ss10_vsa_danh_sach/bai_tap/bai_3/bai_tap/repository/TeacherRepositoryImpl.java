package ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.repository;

import ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepositoryImpl implements ITeacherRepository {
    private static ArrayList<Teacher> teacherArrayList = new ArrayList<>();

    static {
        //public Teacher(int id, String name, String dayOfBirth, boolean gender, String bangCap, String kinhNghiem)
        teacherArrayList.add(new Teacher(1, "Chánh ti zi", "1975", true, "dev", "8 năm"));
        teacherArrayList.add(new Teacher(2, "Trung", "1999", true, "dev", "6 năm"));
        teacherArrayList.add(new Teacher(3, "Công", "1988", true, "dev", "6 năm"));
    }

    @Override
    public List<Teacher> getTeacherList() {
        return teacherArrayList;
    }

    @Override
    public void addNewTeacher(Teacher teacher) {
        teacherArrayList.add(teacher);
    }

    @Override
    public boolean deleteTeacher(int id) {
        for (int i = 0; i < id; i++) {
            if (id == teacherArrayList.get(i).getId()) {
                teacherArrayList.remove(i);
                return true;
            }
        }
        return false;
    }
}
