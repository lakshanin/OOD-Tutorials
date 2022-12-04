package T4;

import T2.Cylinder;
import T3.Date;

public class Director {
    private String firstName, surName;
    private int noOfMoviesDirected;
    private Date dateOfBirth;

    public Director(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public int getNoOfMoviesDirected() {
        return noOfMoviesDirected;
    }

    public void setNoOfMoviesDirected(int noOfMoviesDirected) {
        this.noOfMoviesDirected = noOfMoviesDirected;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString(){
        return ("Director[Firstname: "+this.firstName+" Surname: "+this.surName+" DOB: "+this.dateOfBirth+" No of movies directed: "+this.noOfMoviesDirected);
    }
}
