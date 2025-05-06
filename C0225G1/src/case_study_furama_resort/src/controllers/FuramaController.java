package controllers;

import service.*;

import java.util.Scanner;

public class FuramaController {
    static final Scanner sc = new Scanner(System.in);
    static final IEmployeeService employeeService = new EmployeeService();
    static final ICustomerService customerService = new CustomerService();
    static final IFacilityService facilityService = new FacilityService();
    static final IBookingService bookingService = new BookingService();
    static final IContactService contactService = new ContactService();
    static final IPromotionService promotionService = new PromotionService();


    public static void displayMainMenu() {
        boolean flagMain = true;
        do {
            System.out.println("-----Furama ReSort Menu-----" +
                    "\n 1. Employee Management" +
                    "\n 2. Customer Management" +
                    "\n 3. Facility Management" +
                    "\n 4. Booking Management" +
                    "\n 5. Promotion Management" +
                    "\n 6. Exit");
            System.out.print("Vui lòng chọn chức năng chính: ");
            int chooseMenuMain = sc.nextInt();
            switch (chooseMenuMain) {
                case 1:
                    boolean flagEmployee = true;
                    do {
                        System.out.println("-----Employee Management-----" +
                                "\n 1.Display List Employees" +
                                "\n 2. Add new employee" +
                                "\n 3. Edit employee" +
                                "\n 4. Return main menu");
                        System.out.print("Chọn chức năng cho employee: ");
                        int chooseMenuEmployee = sc.nextInt();
                        switch (chooseMenuEmployee) {
                            case 1:
                                System.out.println("-----Display List Employees-----");
                                employeeService.display();
                                break;
                            case 2:
                                System.out.println("-----Add new employee-----");
                                employeeService.addNew();
                                break;
                            case 3:
                                System.out.println("-----Edit employee-----");
                                employeeService.edit();
                                break;
                            default:
                                flagEmployee = false;
                        }
                    } while (flagEmployee);
                    break;
                case 2:
                    boolean flagCustomer = true;
                    do {
                        System.out.println("-----Customer Management-----" +
                                "\n 1.Display List customer" +
                                "\n 2. Add new customer" +
                                "\n 3. Edit customer" +
                                "\n 4. Return main menu");
                        System.out.print("Chọn chức năng cho customer: ");
                        int chooseMenuCustomer = sc.nextInt();
                        switch (chooseMenuCustomer) {
                            case 1:
                                System.out.println("-----Display List Customer-----");
                                customerService.display();
                                break;
                            case 2:
                                System.out.println("-----Add new Customer-----");
                                customerService.addNew();
                                break;
                            case 3:
                                System.out.println("-----Edit Customer-----");
                                customerService.edit();
                                break;
                            default:
                                flagCustomer = false;
                        }
                    } while (flagCustomer);
                    break;
                case 3:
                    boolean flagFacility = true;
                    do {
                        System.out.println("-----Facility Management-----" +
                                "\n 1.Display List Facility" +
                                "\n 2. Add new Facility" +
                                "\n 3. Display list facility maintenance" +
                                "\n 4. Return main menu");
                        System.out.print("Chọn chức năng cho Facility: ");
                        int chooseMenuFacility = sc.nextInt();
                        switch (chooseMenuFacility) {
                            case 1:
                                System.out.println("-----Display List Facility-----");
                                facilityService.display();
                                break;
                            case 2:
                                System.out.println("-----Add new Facility-----");
                                facilityService.addNew();
                                break;
                            case 3:
                                System.out.println("-----Display list facility maintenance-----");
                                facilityService.displayMaintenance();
                                break;
                            default:
                                flagFacility = false;
                        }
                    } while (flagFacility);
                    break;
                case 4:
                    boolean flagBooking = true;
                    do {
                        System.out.println("-----Booking Management-----" +
                                "\n 1. Add new Booking" +
                                "\n 2. Display List Booking" +
                                "\n 3. Create new contracts" +
                                "\n 4. Display list contracts" +
                                "\n 5. Edit contracts" +
                                "\n 6. Return main menu");
                        System.out.print("Chọn chức năng cho Booking: ");
                        int chooseMenuBooking = sc.nextInt();
                        switch (chooseMenuBooking) {
                            case 1:
                                System.out.println("-----Add new Booking-----");
                                bookingService.addNew();
                                break;
                            case 2:
                                System.out.println("-----Display List Booking-----");
                                bookingService.display();
                                break;
                            case 3:
                                System.out.println("-----Create new contracts-----");
                                contactService.create();
                                break;
                            case 4:
                                System.out.println("-----Display list contracts-----");
                                contactService.display();
                                break;
                            case 5:
                                System.out.println("-----Edit contracts-----");
                                contactService.edit();
                                break;
                            default:
                                flagBooking = false;
                        }
                    } while (flagBooking);
                    break;
                case 5:
                    boolean flagPromotion = true;
                    do {
                        System.out.println("-----Promotion Management-----" +
                                "\n 1. Display list customers use service" +
                                "\n 2. Display list customers get voucher" +
                                "\n 3. Return main menu");
                        System.out.print("Chọn chức năng cho Promotion: ");
                        int chooseMenuPromotion = sc.nextInt();
                        switch (chooseMenuPromotion) {
                            case 1:
                                System.out.println("-----Display list customers use service-----");
                                System.out.print("Enter year to display customers: ");
                                int year = Integer.parseInt(sc.nextLine());
                                promotionService.displayCustomerUseServiceInYear(year);
                                break;
                            case 2:
                                System.out.println("-----Display list customers get voucher-----");
                                System.out.print("Enter number of vouchers (10%, 20%, 50%): ");
                                System.out.print("Voucher 10%: ");
                                int v10 = Integer.parseInt(sc.nextLine());
                                System.out.print("Voucher 20%: ");
                                int v20 = Integer.parseInt(sc.nextLine());
                                System.out.print("Voucher 50%: ");
                                int v50 = Integer.parseInt(sc.nextLine());
                                promotionService.giveVoucher(v10, v20, v50);
                                break;
                            default:
                                flagPromotion = false;
                        }
                    } while (flagPromotion);
                    break;
                default:
                    flagMain = false;
            }
        } while (flagMain);
    }
}
