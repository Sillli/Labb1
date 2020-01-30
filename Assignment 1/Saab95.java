import java.awt.*;

/**
 * A subclass to car that describes Saab95.
 */
public class Saab95 extends Car {
    /**
     * Defines an object as an boolean.
     */
    private boolean turboOn;

    /**
     * Constructor of the class.
     * Contains the car's unique attribute that is needed at start
     */
    public Saab95() {
        setNrDoors(2);
        setColor(Color.red);
        setEnginePower(125);
        turboOn = false;
        setModelName("Saab95");
        stopEngine();
    }

    /**
     * @return true when the turbo is on.
     */
    public void setTurboOn() {
        turboOn = true;
    }

    /**
     * @return false when the turbo is off.
     */
    public void setTurboOff() {
        turboOn = false;
    }

    /**
     * The turbo has the value 1.
     * If the turbo is on and the turbo's value equals 1,3 then it returns the speedfactor.
     *
     * @return the value of the speedfactor as a double.
     */
    @Override
    public double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    /**
     * Uses the helperfunction incrementHelper to increase the value (amount).
     *
     * @param amount is the value that we want to increase.
     */
    @Override
    public void incrementSpeed(double amount) {
        currentSpeed = Math.min(incrementHelper(amount), getEnginePower());
    }

    /**
     * Uses the helperfunction decrementHelper to decrease the value (amount).
     *
     * @param amount is the value that we want to decrease.
     */

    @Override
    public void decrementSpeed(double amount) {
        decrementHelper(amount);
    }


}