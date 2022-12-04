package Q2;

public class SavingsAccount extends Account{

    private double minBalance;
    private String dateOfOpening;
    private Customer customer;

    private void addCustomer(){}
    private void removeCustomer(){}

    public SavingsAccount(String accNo, double balance, double minBalance, String dateOfOpening, Customer customer) {
        super(accNo, balance);
        this.minBalance = minBalance;
        this.dateOfOpening = dateOfOpening;
        this.customer = customer;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public String getDateOfOpening() {
        return dateOfOpening;
    }

    public void setDateOfOpening(String dateOfOpening) {
        this.dateOfOpening = dateOfOpening;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
