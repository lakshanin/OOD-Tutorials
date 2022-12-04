package Q2;

import java.util.ArrayList;

public class Customer {

    private String customerId, name, address, phone;
    private SavingsAccount savingsAccount;
    private CurrentAccount currentAccount;
    private ArrayList<Loan> listOfLoans = new ArrayList<>();

    public Customer(String customerId, String name, String address, String phone, SavingsAccount savingsAccount, CurrentAccount currentAccount, ArrayList<Loan> listOfLoans) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.savingsAccount = savingsAccount;
        this.currentAccount = currentAccount;
        this.listOfLoans = listOfLoans;
    }

    public boolean addLoan(Loan l){
        return this.listOfLoans.add(l);
    }

    public boolean removeLoan(Loan l){
        return this.listOfLoans.remove(l);
    }

    public ArrayList<Loan> getListOfLoans() {
        return listOfLoans;
    }

    public void setListOfLoans(ArrayList<Loan> listOfLoans) {
        this.listOfLoans = listOfLoans;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public CurrentAccount getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(CurrentAccount currentAccount) {
        this.currentAccount = currentAccount;
    }
}
