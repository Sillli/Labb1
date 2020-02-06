import java.awt.*;

/**
 * Class describing Volvo240 its unique attributes
 */
public class Volvo240 extends Car {
    /**
     * Attribut that we use to calculate the speed.
     */
    private final static double trimFactor = 1.25;

    public Volvo240() {
        super(0,1,0,0,4,100,0,Color.black,"Volvo240");
        stopEngine();


    }
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

