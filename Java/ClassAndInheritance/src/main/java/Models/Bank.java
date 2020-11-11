package Models;

public class Bank {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public Bank() {
    }

    public Bank(int accountNumber, double balance, String customerName, String email, long phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String depositFunds(double fund){
        this.balance+=fund;
        return "Deposit Completed Successfully";
    }

    public String withdrawFunds(double fund){
        if((this.balance-fund) < 0){
            return "You can't withdraw the funds. Insufficient Balance..";
        }
        this.balance-=fund;
        return "Successfully funds were withdrawn..";
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
