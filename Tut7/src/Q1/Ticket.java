package Q1;

import java.util.ArrayList;

public class Ticket {

    private int ticketId, offenceCode;
    private String ticketDate, location;
    private double balance;
    private ArrayList<PaymentAllocation> listOfPaymentAllocations= new ArrayList<>();
    private Attendent attendent;
    private TicketStatus ticketStatus;
    private Vehicle vehicle;

    public Ticket(int ticketId, int offenceCode, String ticketDate, String location, double balance, ArrayList<PaymentAllocation> listOfPaymentAllocations, Attendent attendent, TicketStatus ticketStatus, Vehicle vehicle) {
        this.ticketId = ticketId;
        this.offenceCode = offenceCode;
        this.ticketDate = ticketDate;
        this.location = location;
        this.balance = balance;
        this.listOfPaymentAllocations = listOfPaymentAllocations;
        this.attendent = attendent;
        this.ticketStatus = ticketStatus;
        this.vehicle = vehicle;
    }

    public boolean addPaymentAllocation(PaymentAllocation p){
        return(this.listOfPaymentAllocations.add(p));
    }

    public boolean removePaymentAllocation(PaymentAllocation p){
        return(this.listOfPaymentAllocations.remove(p));
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getOffenceCode() {
        return offenceCode;
    }

    public void setOffenceCode(int offenceCode) {
        this.offenceCode = offenceCode;
    }

    public String getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<PaymentAllocation> getListOfPaymentAllocations() {
        return listOfPaymentAllocations;
    }

    public void setListOfPaymentAllocations(ArrayList<PaymentAllocation> listOfPaymentAllocations) {
        this.listOfPaymentAllocations = listOfPaymentAllocations;
    }

    public Attendent getAttendent() {
        return attendent;
    }

    public void setAttendent(Attendent attendent) {
        this.attendent = attendent;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
