package T1;

public class Rectangle {

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if ((length>0.5) && (length<5.0))
            this.length = length;
        else
            System.out.println("Invalid value");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if ((width>10.0) && (width<100.00))
            this.width = width;
        else
            System.out.println("Invalid value");
    }

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
