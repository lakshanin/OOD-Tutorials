package T4;

import T3.Date;

public class Test {
    public static void main(String[] args) {

        Director d1 = new Director("Lakshani", "Nissanka");
        Date dob = new Date (25, 12, 2001);
        d1.setDateOfBirth(dob);
        d1.setNoOfMoviesDirected(100);

        System.out.println(d1.toString()); // toString()
        System.out.println("name is: " + d1.getFirstName());
        System.out.println("surname is: " + d1.getSurName());
        System.out.println("dob is: " + d1.getDateOfBirth().toString());
        System.out.println("number of directed movies is: " + d1.getNoOfMoviesDirected());
    }
}
