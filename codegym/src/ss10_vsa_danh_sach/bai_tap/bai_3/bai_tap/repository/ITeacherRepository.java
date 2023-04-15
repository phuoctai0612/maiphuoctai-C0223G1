package ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.repository;

import ss10_vsa_danh_sach.bai_tap.bai_3.bai_tap.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> getTeacherList();

    void addNewTeacher(Teacher teacher);

    boolean deleteTeacher(int id);
}
