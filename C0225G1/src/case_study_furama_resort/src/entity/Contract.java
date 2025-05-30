package entity;

public class Contract {
    private String contractId;
    private String bookingId;
    private double deposit;
    private double totalPayment;
    

    public Contract(String contractId, String bookingId, double deposit, double totalPayment) {
        this.contractId = contractId;
        this.bookingId = bookingId;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractId='" + contractId + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", deposit=" + deposit +
                ", totalPayment=" + totalPayment +
                '}';
    }
    
    public String getInfo(){
        return String.join(",", contractId, bookingId, String.valueOf(deposit), String.valueOf(totalPayment));
    }
}
