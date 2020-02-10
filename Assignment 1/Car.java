
import java.awt.*;


/**
 * An abstract class representing a Car that extends the abstract class Movable
 */

public abstract class Car<T extends Engine> extends Motorized<T> {

    public Car() {

    }

    /**
     * A method that uses the car's position, direction & speed to move it.
     */
    @Override
    public void move() {
        if (position.getDirX() != 0) {
            position.setPosX((position.getPosX() + position.getDirX() * getCurrentSpeed()));
        } else if (position.getDirY() != 0) {
            position.setPosY((position.getPosY() + position.getDirY() * getCurrentSpeed()));
        }
    }
}
