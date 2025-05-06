package service;

import entity.Employee;
import repository.EmployeeRepository;
import repository.IEmployeeRepository;
import utils.ValidateUtils;
import view.EmployeeView;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService{
    private final IEmployeeRepository employeeRepo = new EmployeeRepository();
    private final Scanner sc = new Scanner(System.in);

    @Override
    public void edit() {
        List<Employee> list = employeeRepo.getAll();
        System.out.print("Enter employee ID to edit: ");
        String id = sc.nextLine();

        for (Employee e : list) {
            if (e.getId().equals(id)) {
                e.setName(EmployeeView.inputName());
                e.setDateOfBirth(EmployeeView.inputBirthDate());
                e.setGender(EmployeeView.inputGender());
                e.setIdentityCard(EmployeeView.inputCmnd());
                e.setPhoneNumber(EmployeeView.inputPhone());
                e.setEmail(EmployeeView.inputEmail());
                e.setLevel(EmployeeView.inputLevel());
                e.setPosition(EmployeeView.inputPosition());
                e.setSalary(EmployeeView.inputSalary());

                employeeRepo.edit(list);
                System.out.println("Employee updated!");
                return;
            }
        }
        System.out.println("Employee ID not found.");
    }

    @Override
    public void display() {
        List<Employee> list = employeeRepo.getAll();
        for (Employee e : list) {
            System.out.println(e);
        }
    }

    @Override
    public void addNew() {
        Employee employee = EmployeeView.inputEmployee();
        employeeRepo.add(employee);
        System.out.println("Employee added successfully!");
    }
}
