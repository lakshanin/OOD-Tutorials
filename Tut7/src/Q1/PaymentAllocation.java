package Q1;

public class PaymentAllocation {

    private double amount;
    private Ticket ticket;
    private Payment payment;

    public PaymentAllocation(double amount, Ticket ticket, Payment payment) {
        this.amount = amount;
        this.ticket = ticket;
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
