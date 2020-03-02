import java.awt.*;

public abstract class Truck<T extends Engine> extends Motorized<T> {
    protected Flatbed flatbed;


    /***
     * A constructor of a Flatbed object
     */
    public Truck() {

    }

    /**
     * Checks if the flatbed is up, and if it is the scania can not move and a "error message" prints out
     * if the flatbed is down the car can move
     */
    @Override
    public void move() {
        if (flatbed.getFlatbedAngle() != 0) {
            setCurrentSpeed(0);
        } else if (flatbed.getFlatbedAngle() == 0) {
            if (getDirX() != 0) {
                position.setPosX((position.getPosX() + getDirX() * getCurrentSpeed()));
            } else if (getDirY() != 0) {
                position.setPosY((position.getPosY() + getDirY() * getCurrentSpeed()));
            }
        }
    }


}
