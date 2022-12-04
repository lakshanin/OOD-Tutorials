package Q1;

import java.util.ArrayList;

public class TicketStatus {

    private String status;
    private ArrayList<Ticket> listOfTickets =new ArrayList<>();

    public TicketStatus(String status, ArrayList<Ticket> listOfTickets) {
        this.status = status;
        this.listOfTickets = listOfTickets;
    }

    public boolean addTicket(Ticket t){
        return(this.listOfTickets.add(t));
    }

    public boolean removeTicket(Ticket t){
        return(this.listOfTickets.remove(t));
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Ticket> getListOfTickets() {
        return listOfTickets;
    }

    public void setListOfTickets(ArrayList<Ticket> listOfTickets) {
        this.listOfTickets = listOfTickets;
    }
}
