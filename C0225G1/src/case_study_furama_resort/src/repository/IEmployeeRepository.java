package repository;

import entity.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getAll();
    public void add(Employee employee);
    public void edit(List<Employee> employees);
}
