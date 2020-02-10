import java.util.Optional;

/**
 * A class that can be used by every other class that is in need of an engine.
 */
public class Engine {

    private double enginePower;

    public Engine(double enginePower) {
        this.enginePower = enginePower;

    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public double speedFactor() {
         return getEnginePower() * 0.01 * 1;
    }
}
