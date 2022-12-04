package Q2;

import java.util.ArrayList;

public class Customer {

    private String customerId, name, address, phone;
    private ArrayList<Loan> loans = new ArrayList<>();
    private SavingsAccount savingsAccount;
    private CurrentAccount currentAccount;
}
