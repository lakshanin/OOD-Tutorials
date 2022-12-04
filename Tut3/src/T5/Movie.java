package T5;

import T4.Director;

public class Movie {

    private String title, category;
    private int noOfAwards;
    private Director director;

    public Movie(String title, String category, Director director) {
        this.title = title;
        this.category = category;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public int getNoOfAwards() {
        return noOfAwards;
    }

    public void setNoOfAwards(int noOfAwards) {
        this.noOfAwards = noOfAwards;
    }

    public Director getDirector() {
        return director;
    }

    public String toString(){
        return ("Movie[Title: "+this.title+" Category: "+this.category+" Number of awards: "+this.noOfAwards+" Director: "+this.director);
    }
}
