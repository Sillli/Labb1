import java.awt.*;

/**
 * A class that can be used for any class that needs doors & a color.
 * Contains setters and getters.
 */
public class Caross {

    private int nrDoors;
    private Color color;

    public Caross(int nrDoors, Color color) {
        this.nrDoors = nrDoors;
        this.color = color;
    }

    public int getNrDoors() {
        return nrDoors;
    }

    public void setNrDoors(int nrDoors) {
        this.nrDoors = nrDoors;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
