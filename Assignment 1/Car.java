
import java.awt.*;


/**
 * An abstract class representing a Car that extends the abstract class Vehicle
 * Contains the attributes common between cars
 * All cars have the attributes of NrDoors, enginePower, currentSpeed, color and a modelName.
 */

public abstract class Car extends Movable {

    public Car(String modelName) {
        super();


    }

    @Override
    public void move() {
        if (position.getDirX() != 0) {
            position.setPosX( (position.getPosX() + position.getDirX() * getCurrentSpeed()));
        } else if (position.getDirY() != 0) {
            position.setPosY( (position.getPosY() + position.getDirY() * getCurrentSpeed()));
        }
    }
}
