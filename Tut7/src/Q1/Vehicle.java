package Q1;

import java.util.ArrayList;

public class Vehicle {

    private int regNo;
    private String model, color;
    private ArrayList<Ticket> listOfTickets =new ArrayList<>();
    private RegisteredKeeper registeredKeeper;

    public Vehicle(int regNo, String model, String color, ArrayList<Ticket> listOfTickets, RegisteredKeeper registeredKeeper) {
        this.regNo = regNo;
        this.model = model;
        this.color = color;
        this.listOfTickets = listOfTickets;
        this.registeredKeeper = registeredKeeper;
    }

    public boolean addTicket(Ticket t){
        return(this.listOfTickets.add(t));
    }

    public boolean removeTicket(Ticket t){
        return(this.listOfTickets.remove(t));
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Ticket> getListOfTickets() {
        return listOfTickets;
    }

    public void setListOfTickets(ArrayList<Ticket> listOfTickets) {
        this.listOfTickets = listOfTickets;
    }

    public RegisteredKeeper getRegisteredKeeper() {
        return registeredKeeper;
    }

    public void setRegisteredKeeper(RegisteredKeeper registeredKeeper) {
        this.registeredKeeper = registeredKeeper;
    }
}
