package T5;

import T3.Date;
import T4.Director;

public class Test {

    public static void main(String[] args) {

        Director d1 = new Director("Christopher", "Bang");
        Date dob = new Date(05, 10, 1997);
        d1.setDateOfBirth(dob);
        d1.setNoOfMoviesDirected(8);
        System.out.println(d1.toString());

        Movie m1 = new Movie("SKZ", "Comedy", d1);
        m1.setNoOfAwards(100);
        System.out.println(m1.toString());

        System.out.println("title is: " + m1.getTitle());
        System.out.println("category is: " + m1.getCategory());
        System.out.println("name of director is: " +
                m1.getDirector().getFirstName());
        System.out.println("surname of director is: " +
                m1.getDirector().getSurName());
        System.out.println("number of awards is " + m1.getNoOfAwards());

    }
}
