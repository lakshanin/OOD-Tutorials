package T2;

public class Cylinder {

    private double radius, height;
    public static int noOfCylinders;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void increaseCylinders(){
        noOfCylinders +=1;
    }

    public int getNoOfCylinders() {
        return noOfCylinders;
    }
}
