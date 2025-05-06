package repository;

import entity.Customer;
import utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    private static final String FILE_PATH = "src/data/customer.csv";
    
    @Override
    public List<Customer> getAll() {
        List<String> lines = FileUtils.readFile(FILE_PATH);
        List<Customer> customers = new ArrayList<>();
        for (String line : lines) {
            String[] arr = line.split(",");
            customers.add(new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]));
        }
        return customers;
    }

    @Override
    public void add(Customer customer) {
        FileUtils.writeFile(FILE_PATH, customer.getInfo(), true);
    }

    @Override
    public void edit(List<Customer> customers) {
        List<String> lines = new ArrayList<>();
        for (Customer c : customers) {
            lines.add(c.getInfo());
        }
        FileUtils.writeFile(FILE_PATH, lines, false);
    }
}
