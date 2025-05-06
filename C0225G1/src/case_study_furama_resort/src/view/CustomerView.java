package view;

import entity.Customer;
import utils.ValidateUtils;

import java.util.Scanner;

public class CustomerView {
    private static final Scanner sc = new Scanner(System.in);

    public static Customer inputCustomer() {
        String id;
        do {
            System.out.print("Enter customer ID (KH-YYYY): ");
            id = sc.nextLine();
        } while (!id.matches(ValidateUtils.ID_CUSTOMER_REGEX));

        String name;
        do {
            System.out.print("Enter name (capitalize first letters): ");
            name = sc.nextLine();
        } while (!name.matches(ValidateUtils.NAME_REGEX));

        String birthDate;
        do {
            System.out.print("Enter birth date (dd/MM/yyyy): ");
            birthDate = sc.nextLine();
        } while (!ValidateUtils.isValidAge(birthDate));

        System.out.print("Enter gender: ");
        String gender = sc.nextLine();

        String cmnd;
        do {
            System.out.print("Enter ID card (9 or 12 digits): ");
            cmnd = sc.nextLine();
        } while (!cmnd.matches(ValidateUtils.CMND_REGEX));

        String phone;
        do {
            System.out.print("Enter phone (starts with 0, 10 digits): ");
            phone = sc.nextLine();
        } while (!phone.matches(ValidateUtils.PHONE_REGEX));

        String email;
        do {
            System.out.print("Enter email: ");
            email = sc.nextLine();
        } while (!email.matches(ValidateUtils.EMAIL_REGEX));

        System.out.print("Enter customer type (Diamond/Platinum/...): ");
        String type = sc.nextLine();

        System.out.print("Enter address: ");
        String address = sc.nextLine();

        return new Customer(id, name, birthDate, gender, cmnd, phone, email, type, address);
    }

    public static Customer editCustomer(Customer customer) {
        System.out.print("Enter new name: ");
        customer.setName(sc.nextLine());

        System.out.print("Enter new birth date (dd/MM/yyyy): ");
        customer.setDateOfBirth(sc.nextLine());

        System.out.print("Enter new gender: ");
        customer.setGender(sc.nextLine());

        System.out.print("Enter new identity card: ");
        customer.setIdentityCard(sc.nextLine());

        System.out.print("Enter new phone number: ");
        customer.setPhoneNumber(sc.nextLine());

        System.out.print("Enter new email: ");
        customer.setEmail(sc.nextLine());

        System.out.print("Enter new customer type: ");
        customer.setCustomerType(sc.nextLine());

        System.out.print("Enter new address: ");
        customer.setAddress(sc.nextLine());

        return customer;
    }
}