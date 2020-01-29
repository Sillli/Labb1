import java.awt.*;

/**
 * Class describing Volvo240 its unique attributes
 */
public class Volvo240 extends Car {

    public Volvo240() {
        setNrDoors(4);
        setColor(Color.black);
        setEnginePower(100);
        setModelName("Volvo240");
        stopEngine();

    }

    /**
     * Attribut that we use to calculate the speed.
     */
    private final static double trimFactor = 1.25;

    /**
     *speedfactor is a part of the calulation of speed
     * @return the speedfactor in double,
     */
    @Override
    public double speedFactor() {
        return getEnginePower() * 0.01 * trimFactor;
    }


    /**
     * Calculates the increment of the speed by using helper function incrementHelper and getEnginePower
     * chooses the one with the lowest value of the two of them.
     * @param amount
     */
    @Override
    public void incrementSpeed(double amount) {
        currentSpeed = Math.min(incrementHelper(amount), getEnginePower());
    }

    /**
     * Calculates the decrement of speed using helper function decrementHelper and 0, the 0 represents a car that is not moving.
     * @param amount
     */
    @Override
    public void decrementSpeed(double amount) {
        currentSpeed = Math.max(decrementHelper(amount), 0);
    }
}

