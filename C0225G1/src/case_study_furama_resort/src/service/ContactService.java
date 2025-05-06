package service;

import entity.Booking;
import entity.Contract;
import repository.BookingRepository;
import repository.ContractRepository;
import repository.IContractRepository;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ContactService implements IContactService{
    private final IContractRepository contractRepo = new ContractRepository();
    private final Queue<Booking> bookingQueue = new LinkedList<>(new BookingRepository().getAll());
    private final Scanner sc = new Scanner(System.in);
    
    @Override
    public void create() {
        if (bookingQueue.isEmpty()) {
            System.out.println("No bookings available to create contract.");
            return;
        }

        Booking booking = bookingQueue.poll();
        System.out.println("Creating contract for booking: " + booking);

        System.out.print("Enter contract number: ");
        String contractNumber = sc.nextLine();
        System.out.print("Enter deposit amount: ");
        double deposit = Double.parseDouble(sc.nextLine());
        System.out.print("Enter total payment: ");
        double total = Double.parseDouble(sc.nextLine());

        Contract contract = new Contract(contractNumber, booking.getBookingId(), deposit, total);
        contractRepo.add(contract);
        System.out.println("✔ Contract created.");
    }

    @Override
    public void display() {
        for (Contract c : contractRepo.getAll()) {
            System.out.println(c);
        }
    }

    @Override
    public void edit() {
        System.out.print("Enter contract number to edit: ");
        String number = sc.nextLine();
        List<Contract> list = contractRepo.getAll();
        for (Contract c : list) {
            if (c.getInfo().contains(number)) {
                System.out.print("Enter new deposit: ");
                double newDeposit = Double.parseDouble(sc.nextLine());
                System.out.print("Enter new total payment: ");
                double newTotal = Double.parseDouble(sc.nextLine());

                Contract updated = new Contract(number, c.getBookingId(), newDeposit, newTotal);
                contractRepo.update(updated);
                System.out.println("✔ Contract updated.");
                return;
            }
        }
        System.out.println("⚠ Contract not found.");
    }
}
