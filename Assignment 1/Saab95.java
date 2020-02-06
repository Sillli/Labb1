import java.awt.*;
import java.util.LinkedList;
import java.util.List;

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
        super(0,1,0,0,2,125,0,Color.red,"Saab95");
        turboOn = false;
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



}