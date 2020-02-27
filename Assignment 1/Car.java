
import java.awt.*;


/**
 * An abstract class representing a Car that extends the abstract class Movable
 */

public abstract class Car<T extends Engine> extends Motorized<T> {
    //Position position;
    public Car() {


    }

    /**
     * A method that uses the car's position, direction & speed to move it.
     */
    @Override
    public void move() {
        if (getDirX() != 0) {
            position.setPosX((position.getPosX() + getDirX() * getCurrentSpeed()));
        } else if (getDirY() != 0) {
            position.setPosY((position.getPosY() + getDirY() * getCurrentSpeed()));
        }
    }
}
