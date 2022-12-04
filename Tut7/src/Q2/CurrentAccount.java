package Q2;

public class CurrentAccount extends Account{

    private double interestRate;
    private String dateOfOpening;
    private Customer customer;

    private void addCustomer(){}
    private void removeCustomer(){}

    public CurrentAccount(String accNo, double balance, double interestRate, String dateOfOpening, Customer customer) {
        super(accNo, balance);
        this.interestRate = interestRate;
        this.dateOfOpening = dateOfOpening;
        this.customer = customer;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
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
