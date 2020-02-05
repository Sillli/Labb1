import java.awt.*;

public abstract class Truck extends Movable  {

    protected Flatbed flatbed;


    /***
     * A constructor of a Flatbed object
     */
    public Truck(int dirX, int dirY, int posX, int posY, int nrDoors, double enginePower, double currentSpeed,
                 Color color, String modelName) {
        super(dirX, dirY, posX, posY, nrDoors, enginePower, currentSpeed,
                color, modelName);
    }

    /**
     * Checks if the flatbed is up, and if it is the scania can not move and a "error message" prints out
     * if the flatbed is down the car can move
     */
    @Override
    public void move() {
        if (flatbed.getFlatbedAngle() != 0) {
            setCurrentSpeed(0);
            System.out.println("Flatbed is up");
        } else if (flatbed.getFlatbedAngle() == 0) {
            if (getDirX() != 0) {
                setPosX((int) (getPosX() + getDirX() * getCurrentSpeed()));
            } else if (getDirY() != 0) {
                setPosY((int) (getPosY() + getDirY() * getCurrentSpeed()));
            }
        }
    }


}
