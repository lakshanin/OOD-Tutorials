package Q2;

public class Account {

    private String accNo;
    private double balance;

    public void creditAmount(double amount){
        balance -= amount;
    }
    public void debitAmount(double amount){
        balance += amount;
    }
    public double getBalance(){
        return this.balance;
    }

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
