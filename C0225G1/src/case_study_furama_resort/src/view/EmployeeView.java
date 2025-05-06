package view;

import entity.Employee;
import utils.ValidateUtils;

import java.util.Scanner;

public class EmployeeView {
    private static final Scanner sc = new Scanner(System.in);

    public static String inputId() {
        String id;
        do {
            System.out.print("Enter employee ID (format NV-YYYY): ");
            id = sc.nextLine();
        } while (!id.matches(ValidateUtils.ID_EMPLOYEE_REGEX));
        return id;
    }

    public static String inputName() {
        String name;
        do {
            System.out.print("Enter name (capitalize first letter): ");
            name = sc.nextLine();
        } while (!name.matches(ValidateUtils.NAME_REGEX));
        return name;
    }

    public static String inputBirthDate() {
        String birthDate;
        do {
            System.out.print("Enter birth date (dd/MM/yyyy, >= 18 tuổi): ");
            birthDate = sc.nextLine();
        } while (!ValidateUtils.isValidAge(birthDate));
        return birthDate;
    }

    public static String inputGender() {
        System.out.print("Enter gender: ");
        return sc.nextLine();
    }

    public static String inputCmnd() {
        String cmnd;
        do {
            System.out.print("Enter ID card (9 or 12 digits): ");
            cmnd = sc.nextLine();
        } while (!cmnd.matches(ValidateUtils.CMND_REGEX));
        return cmnd;
    }

    public static String inputPhone() {
        String phone;
        do {
            System.out.print("Enter phone number (starts 0, 10 digits): ");
            phone = sc.nextLine();
        } while (!phone.matches(ValidateUtils.PHONE_REGEX));
        return phone;
    }

    public static String inputEmail() {
        String email;
        do {
            System.out.print("Enter email: ");
            email = sc.nextLine();
        } while (!email.matches(ValidateUtils.EMAIL_REGEX));
        return email;
    }

    public static String inputLevel() {
        System.out.print("Enter level: ");
        return sc.nextLine();
    }

    public static String inputPosition() {
        System.out.print("Enter position: ");
        return sc.nextLine();
    }

    public static double inputSalary() {
        double salary;
        do {
            System.out.print("Enter salary (>0): ");
            salary = Double.parseDouble(sc.nextLine());
        } while (salary <= 0);
        return salary;
    }

    public static Employee inputEmployee() {
        return new Employee(
                inputId(),
                inputName(),
                inputBirthDate(),
                inputGender(),
                inputCmnd(),
                inputPhone(),
                inputEmail(),
                inputLevel(),
                inputPosition(),
                inputSalary()
        );
    }
}
