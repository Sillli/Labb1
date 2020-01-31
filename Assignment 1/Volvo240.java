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
     * speedfactor is a part of the calulation of speed
     *
     * @return the speedfactor in double,
     */
    @Override
    public double speedFactor() {
        return getEnginePower() * 0.01 * trimFactor;
    }


}

