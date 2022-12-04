package Q1;

import java.util.ArrayList;

public class RegisteredKeeper {

    private int ref;
    private String name, address, legalState;

    // mapping of the association using list
    private ArrayList<Vehicle> listOfVehicles = new ArrayList<>();

    public RegisteredKeeper(int ref, String name, String address, String legalState, ArrayList<Vehicle> listOfVehicles) {
        this.ref = ref;
        this.name = name;
        this.address = address;
        this.legalState = legalState;
        this.listOfVehicles = listOfVehicles;
    }

    public boolean addVehicle(Vehicle v){
        return(this.listOfVehicles.add(v));
    }

    public boolean removeVehicle(Vehicle v){
        return(this.listOfVehicles.remove(v));
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
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

    public String getLegalState() {
        return legalState;
    }

    public void setLegalState(String legalState) {
        this.legalState = legalState;
    }

    public ArrayList<Vehicle> getListOfVehicles() {
        return listOfVehicles;
    }

    public void setListOfVehicles(ArrayList<Vehicle> listOfVehicles) {
        this.listOfVehicles = listOfVehicles;
    }
}
