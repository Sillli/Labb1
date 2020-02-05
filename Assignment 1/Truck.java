import java.awt.*;

public abstract class Truck extends Movable {
    private Flatbed flatbed;


    /***
     * A constructor of a Flatbed object
     */
    public Truck(int dirX, int dirY, int posX, int posY, int nrDoors, double enginePower, double currentSpeed,
                 Color color, String modelName) {
        super(dirX, dirY, posX, posY, nrDoors, enginePower, currentSpeed,
                color, modelName);
    }




}
