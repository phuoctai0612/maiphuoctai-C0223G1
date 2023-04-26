package furama_management.repository.person;

import furama_management.model.person.Employee;
import furama_management.repository.IEmployeeRepository;
import furama_management.util.ReadAndWriteEmployee;

import java.util.List;


public class EmployeeRepositoryIplm implements IEmployeeRepository {
    private static final String FILE_PATH = "codegym/src/furama_management/box_file/employee.csv";
    List<Employee> employees = ReadAndWriteEmployee.readFile(FILE_PATH);
public int findId(String id){
    for (int i = 0; i < employees.size(); i++) {
        if (employees.get(i).getMa().equals(id)){
            return i;
        }
    }
    return -1;
}

    @Override
    public List<Employee> showList() {
        return employees;
    }

    @Override
    public void addList(Employee employee) {
        employees.add(employee);
        ReadAndWriteEmployee.writeList(FILE_PATH,employees,false);
    }

    @Override
    public void editList() {
          ReadAndWriteEmployee.writeList(FILE_PATH,employees,false);
    }
}
