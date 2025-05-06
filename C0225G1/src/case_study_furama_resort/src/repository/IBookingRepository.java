package repository;

import entity.Booking;

import java.util.Set;

public interface IBookingRepository {
    Set<Booking> getAll();
    void add(Booking booking);
}
