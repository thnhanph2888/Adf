package src.services;

import src.models.person.Employee;
import src.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeServiceImpl implements IEmployeeService {
    private static final String PATH_EMPLOYEE_FILE = "src/data/employee.csv";

    @Override
    public List<Employee> getEmployee() {
        List<Employee> employeeArrayList = new ArrayList<>();

        List<String> list = ReadAndWriteFile.readToFile(PATH_EMPLOYEE_FILE);
        for (int i = 0 ; i < list.size(); i++) {
            String[] properties = list.get(i).split(",");
            employeeArrayList.add(new Employee(properties[0], properties[1], properties[2], properties[3]
                    , properties[4], properties[5], properties[6], properties[7], properties[8], Integer.parseInt(properties[9])));
        }
        return employeeArrayList;
    }

    @Override
    public void add(Employee object) {
        List<Employee> dataSource = getEmployee();
        for (Employee employee : dataSource) {
            if (Objects.equals(employee.getCode(), object.getCode())) {
                return;
            }
        }
        String dataEmployee = object.getDataWrite();
        System.out.println(dataEmployee);
        ReadAndWriteFile.writeToFile(PATH_EMPLOYEE_FILE, dataEmployee);
    }

    @Override
    public void edit(int index, String code, String name, String dayOfBirth, String gender,
                     String id, String phoneNumber, String email, String level, String position, int wage) {
        List<Employee> listEmployee = getEmployee();
        ArrayList<String> listDataWrite = new ArrayList<>();
        listEmployee.set(index, new Employee(code, name, dayOfBirth, gender, id, phoneNumber, email, level, position, wage));
        for (Employee employee : listEmployee) {
            listDataWrite.add(employee.getDataWrite());
        }
        ReadAndWriteFile.writeToFile(PATH_EMPLOYEE_FILE, listDataWrite);
    }

    @Override
    public void remove(int index) {
        List<Employee> listEmployee = getEmployee();
        ArrayList<String> listDataWrite = new ArrayList<>();
        listEmployee.remove(index);
        for (Employee employee : listEmployee) {
            listDataWrite.add(employee.getDataWrite());
        }
        ReadAndWriteFile.writeToFile(PATH_EMPLOYEE_FILE, listDataWrite);
    }
}
