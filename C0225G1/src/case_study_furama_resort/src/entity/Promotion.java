package entity;

public class Promotion {
    private String customerId;
    private String customerName;
    private double discount;

    public Promotion(String customerId, String customerName, double discount) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.discount = discount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", discount=" + discount +
                '}';
    }
}
