package entity;

public class Booking implements Comparable<Booking>{
    private String bookingId;
    private String bookingDate;
    private String startDate;
    private String endDate;
    private String customerId;
    private String serviceCode;
    
    public Booking(String bookingId, String bookingDate, String startDate, String endDate, String customerId, String serviceCode) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerId = customerId;
        this.serviceCode = serviceCode;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public int compareTo(Booking o) {
        int compareStart = this.startDate.compareTo(o.startDate);
        return (compareStart != 0) ? compareStart : this.endDate.compareTo(o.endDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking)) return false;
        Booking b = (Booking) o;
        return bookingId.equals(b.bookingId);
    }

    @Override
    public int hashCode() {
        return bookingId.hashCode();
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", bookingDate='" + bookingDate + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customerId='" + customerId + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                '}';
    }

    public String getInfo() {
        return String.join(",", bookingId, bookingDate ,startDate, endDate, customerId, serviceCode);
    }
    
}
