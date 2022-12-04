package Q1;

import java.util.ArrayList;

public class Payment {

    private String paymentDate;
    private int transactionRefNo;
    private double amount;
    private ArrayList<PaymentAllocation> listOfPaymentAllocations= new ArrayList<>();

    public Payment(String paymentDate, int transactionRefNo, double amount, ArrayList<PaymentAllocation> listOfPaymentAllocations) {
        this.paymentDate = paymentDate;
        this.transactionRefNo = transactionRefNo;
        this.amount = amount;
        this.listOfPaymentAllocations = listOfPaymentAllocations;
    }

    public boolean addPaymentAllocation(PaymentAllocation p){
        return(this.listOfPaymentAllocations.add(p));
    }

    public boolean removePaymentAllocation(PaymentAllocation p){
        return(this.listOfPaymentAllocations.remove(p));
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getTransactionRefNo() {
        return transactionRefNo;
    }

    public void setTransactionRefNo(int transactionRefNo) {
        this.transactionRefNo = transactionRefNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ArrayList<PaymentAllocation> getListOfPaymentAllocations() {
        return listOfPaymentAllocations;
    }

    public void setListOfPaymentAllocations(ArrayList<PaymentAllocation> listOfPaymentAllocations) {
        this.listOfPaymentAllocations = listOfPaymentAllocations;
    }
}
