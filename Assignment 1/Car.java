
import java.awt.*;


/**
 * An abstract class representing a Car that extends the abstract class Vehicle
 * Contains the attributes common between cars
 * All cars have the attributes of NrDoors, enginePower, currentSpeed, color and a modelName.
 */

public abstract class Car extends Movable {
    /**
     * constructor for the Class
     *
     * @param dirX         the value of direction in x-axis
     * @param dirY         the value of direction in y-axis
     * @param posX         the value of the positions x value
     * @param posY         the value of the positions y value
     * @param nrDoors
     * @param enginePower
     * @param currentSpeed
     * @param color
     * @param modelName
     */
    public Car(int dirX, int dirY, int posX, int posY, int nrDoors, double enginePower, double currentSpeed, Color color, String modelName) {
        super(dirX, dirY, posX, posY, nrDoors, enginePower, currentSpeed, color, modelName);
    }

    /**
     * A constructor that's used by subclasses to the Car
     */

    /**
     * A Method that moves the cars position with the rate of the currentSpeed of the car
     */
    @Override
    public void move() {
        if (getDirX() != 0) {
            setPosX((int) (getPosX() + getDirX() * getCurrentSpeed()));
        } else if (getDirY() != 0) {
            setPosY((int) (getPosY() + getDirY() * getCurrentSpeed()));
        }
    }
}
