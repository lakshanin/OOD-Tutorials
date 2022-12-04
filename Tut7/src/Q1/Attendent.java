package Q1;

import java.util.ArrayList;

public class Attendent {

    private int attendentId;
    private String name;
    private ArrayList<Ticket> listOfTickets = new ArrayList<>();

    public Attendent(int attendentId, String name, ArrayList<Ticket> listOfTickets) {
        this.attendentId = attendentId;
        this.name = name;
        this.listOfTickets = listOfTickets;
    }

    public boolean addTicket(Ticket t){
        return(this.listOfTickets.add(t));
    }

    public boolean removeTicket(Ticket t){
        return(this.listOfTickets.remove(t));
    }

    public int getAttendentId() {
        return attendentId;
    }

    public void setAttendentId(int attendentId) {
        this.attendentId = attendentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Ticket> getListOfTickets() {
        return listOfTickets;
    }

    public void setListOfTickets(ArrayList<Ticket> listOfTickets) {
        this.listOfTickets = listOfTickets;
    }
}
