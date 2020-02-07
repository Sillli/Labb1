/**
 * A class that can be used by every other class that is in need of an engine.
 */
public abstract class Engine {

    public double enginePower;

    public Engine(double enginePower) {
        this.enginePower = enginePower;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public abstract double speedFactor();


}
