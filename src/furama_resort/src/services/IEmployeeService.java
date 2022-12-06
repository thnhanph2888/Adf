package src.services;

import src.models.person.Employee;

import java.util.List;

public interface IEmployeeService extends IService<Employee>{

    List<Employee> getEmployee();

    void add(Employee employee);

    void edit(int index, String code, String name, String dayOfBirth, String gender, String id, String phoneNumber
            , String email, String level, String position, int wage);

    void remove(int index);
}
