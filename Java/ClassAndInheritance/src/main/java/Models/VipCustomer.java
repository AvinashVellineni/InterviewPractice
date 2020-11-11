package Models;

public class VipCustomer {
    private String customerName;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this.customerName = "Avinash";
        this.creditLimit = 10000.00;
        this.emailAddress = "avinash@gmail.com";
    }

    public VipCustomer(String customerName, double creditLimit) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = "Abishek@gmail.com";
    }

    public VipCustomer(String customerName, double creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
