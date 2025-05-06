package service;

import entity.Customer;
import repository.CustomerRepository;
import repository.ICustomerRepository;
import utils.ValidateUtils;
import view.CustomerView;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService{
    private final ICustomerRepository customerRepo = new CustomerRepository();
    private final Scanner sc = new Scanner(System.in);
    
    @Override
    public void edit() {
        List<Customer> list = customerRepo.getAll();
        System.out.print("Enter customer ID to edit: ");
        String id = sc.nextLine();

        for (Customer c : list) {
            if (c.getId().equals(id)) {
                Customer updatedCustomer = CustomerView.editCustomer(c);
                customerRepo.edit(list); 
                System.out.println("Customer updated successfully!");
                return;
            }
        }
        System.out.println("Customer ID not found.");
    }

    @Override
    public void display() {
        List<Customer> list = customerRepo.getAll();
        for (Customer c : list) {
            System.out.println(c);
        }
    }

    @Override
    public void addNew() {
        Customer newCustomer = CustomerView.inputCustomer();
        customerRepo.add(newCustomer);
        System.out.println("Customer added successfully!");
    }
}
