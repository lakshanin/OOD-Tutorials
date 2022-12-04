package Q1;

import java.util.ArrayList;

public class Room implements Drawable{

    private int x, y;
    private double height, width;
    private ArrayList<Furniture> furniture = new ArrayList<>();
    private ArrayList<Structure> structures = new ArrayList<>();

    public void createFurniture(){// accept suitable inputs to create the Furniture object
        this.furniture.add(new Furniture()); // create the Furniture here -- composition
    }

    public void remove(){}

    public void Clone(){}

    @Override
    public void redraw() {

    }

    @Override
    public void hide() {

    }
}
