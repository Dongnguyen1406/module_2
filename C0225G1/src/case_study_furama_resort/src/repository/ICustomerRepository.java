package repository;

import entity.Customer;
import entity.Employee;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAll();
    public void add(Customer customer);
    public void edit(List<Customer> customers);
}
