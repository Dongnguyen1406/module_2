package repository;

import entity.Booking;
import utils.FileUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository{
    private static final String FILE_PATH = "src/data/booking.csv";
    private static final Set<Booking> bookings = new TreeSet<>();

    static {
        // Load từ file
        for (String line : FileUtils.readFile(FILE_PATH)) {
            String[] arr = line.split(",");
            bookings.add(new Booking(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]));
        }
    }
    
    @Override
    public Set<Booking> getAll() {
        return bookings;
    }

    @Override
    public void add(Booking booking) {
        bookings.add(booking);
        FileUtils.writeFile(FILE_PATH, booking.getInfo(), true);
    }
    
}
