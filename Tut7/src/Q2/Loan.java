package Q2;

public class Loan {

    private String type, loanNo;
    private double amount;
    private Customer customer;

    public void addCustomer(){}
    public void prepayment(){}
    public void getEMI(){}

    public Loan(String type, String loanNo, double amount, Customer customer) {
        this.type = type;
        this.loanNo = loanNo;
        this.amount = amount;
        this.customer = customer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
