public class Engine {
    /**
     * A class that can be used by any other class that needs an engine.
     */

    private double enginePower; // Engine power of the car
    private final double trimFactor;
    private CarTurbo carturbo;


    public Engine(double enginePower, double trimFactor, boolean carturbo) {
        this.enginePower = enginePower;
        this.trimFactor = trimFactor;
        if (!carturbo) {
            return;
        } else if (carturbo) {
            this.carturbo = new CarTurbo(false);
        }
    }

    /**
     * 
     * @return
     */
    public double speedFactor() {
        if (this.carturbo != null) {
            double turbo = 1;
            if (this.carturbo.isTurboOn()) turbo = 1.3;
            return getEnginePower() * 0.01 * turbo;
        } else {
            return this.getEnginePower() * 0.01 * this.getTrimFactor();
        }
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public double getTrimFactor() {
        return trimFactor;
    }
}
