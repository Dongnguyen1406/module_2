package repository;

import entity.Employee;
import utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository{
    private static final String FILE_EMPLOYEE = "src/data/employee.csv";
    
    @Override
    public List<Employee> getAll() {
        List<String> lines = FileUtils.readFile(FILE_EMPLOYEE);
        List<Employee> employees = new ArrayList<>();
        for (String line : lines) {
            String[] arr = line.split(",");
            employees.add(new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9])));
        }
        return employees;
    }

    @Override
    public void add(Employee employee) {
        FileUtils.writeFile(FILE_EMPLOYEE, employee.getInfo(), true);
    }

    @Override
    public void edit(List<Employee> employees) {
        List<String> lines = new ArrayList<>();
        for (Employee e : employees) {
            lines.add(e.getInfo());
        }
        FileUtils.writeFile(FILE_EMPLOYEE, lines, false);
    }
}
