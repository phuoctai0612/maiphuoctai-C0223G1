package ss8_clean_code.bai_tap.service;

import ss8_clean_code.bai_tap.repository.IStudentRepository;
import ss8_clean_code.bai_tap.repository.StudentRepository;

public class StudentService implements IStudentService{

    private IStudentRepository iStudentRepository
            = new StudentRepository();
    @Override
    public void showListStudent() {
        iStudentRepository.showListStudent();
    }

}
