package service;

import entity.Booking;
import entity.Customer;
import entity.Facility;
import repository.*;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookingService implements IBookingService{
    private final IBookingRepository bookingRepo = new BookingRepository();
    private final ICustomerRepository customerRepo = new CustomerRepository();
    private final IFacilityRepository facilityRepo = new FacilityRepository();
    private final Scanner sc = new Scanner(System.in);
    
    @Override
    public void createContract() {
        
    }

    @Override
    public void displayBooking() {

    }

    @Override
    public void display() {
        Set<Booking> list = bookingRepo.getAll();
        for (Booking b : list) {
            System.out.println(b);
        }
    }

    @Override
    public void addNew() {
        String bookingId = "BK-" + (bookingRepo.getAll().size() + 1);
        System.out.print("Enter start date (yyyy-MM-dd): ");
        String start = sc.nextLine();
        System.out.print("Enter end date (yyyy-MM-dd): ");
        String end = sc.nextLine();

        System.out.println("Customer list:");
        for (Customer c : customerRepo.getAll()) {
            System.out.println(c.getId() + ": " + c.getName());
        }
        System.out.print("Enter customer ID: ");
        String customerId = sc.nextLine();

        System.out.println("Facility list:");
        for (Map.Entry<Facility, Integer> e : facilityRepo.getAll().entrySet()) {
            System.out.println(e.getKey().getServiceCode() + ": " + e.getKey().getServiceName());
        }
        System.out.print("Enter service ID: ");
        String serviceId = sc.nextLine();

        String bookingDate = LocalDate.now().toString();

        Booking booking = new Booking(bookingId , bookingDate, start, end, customerId, serviceId);
        bookingRepo.add(booking);
        System.out.println("Booking added!");

        // Cập nhật usage facility
        for (Facility f : facilityRepo.getAll().keySet()) {
            if (f.getServiceCode().equals(serviceId)) {
                int current = facilityRepo.getAll().get(f);
                facilityRepo.getAll().put(f, current + 1);
                break;
            }
        }
    }
}
