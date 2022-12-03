package src.services;

import src.models.person.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    public static ArrayList<Employee> employeeArrayList = new ArrayList<>();

    static {
        employeeArrayList.add(new Employee("234", "nhan", "1/1", "male", "05", "032543"
                , "emdd@gmail.com", "university", "fd", 23433));
        employeeArrayList.add(new Employee("234", "nhan", "1/1", "male", "05", "032543"
                , "emdd@gmail.com", "university", "fd", 23433));
        employeeArrayList.add(new Employee("234", "nhan", "1/1", "male", "05", "032543"
                , "emdd@gmail.com", "university", "fd", 23433));
        employeeArrayList.add(new Employee("234", "nhan", "1/1", "male", "05", "032543"
                , "emdd@gmail.com", "university", "fd", 23433));
    }


    public static Employee removeEmployee(int index) {
        Employee element = employeeArrayList.get(index);
        employeeArrayList.remove(index);
        return element;
    }


    @Override
    public List<Employee> disPlayEmployee() {
        return employeeArrayList;
    }

    @Override
    public void add(Employee object) {
        employeeArrayList.add(object);
    }

    @Override
    public void edit(int index, String code, String name, String dayOfBirth, String gender,
                     String id, String phoneNumber, String email, String level, String position, int wage) {
        employeeArrayList.set(index, new Employee(code, name, dayOfBirth, gender, id, phoneNumber, email, level, position, wage));
    }

    @Override
    public void remove(int index) {
        employeeArrayList.remove(index);
    }
}
