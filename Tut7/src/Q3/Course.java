package Q3;

import java.util.ArrayList;
import java.util.Arrays;

public class Course {

    private String title, description, startDate;
    private int duration;
    private double fee;
    private ArrayList<Student> listOfStudents = new ArrayList<>();

    public Course(String title, String description, String startDate, int duration, double fee, ArrayList<Student> listOfStudents) {
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.duration = duration;
        this.fee = fee;
        this.listOfStudents = listOfStudents;
    }

    public boolean addStudent(Student s){
        return this.listOfStudents.add(s);
    }

    public boolean removeStudent(Student s){
        return this.listOfStudents.remove(s);
    }

    public void enroll(){}
    public void gradeExam(){}
    public void makePayment(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
}
