import java.util.Optional;

/**
 * A class that can be used by every other class that is in need of an engine.
 */
public class Engine {

    private double enginePower;
    public Optional<CarTurbo> carTurbo;
    private final double trimFactor;

    public Engine(double enginePower, double trimFactor, boolean carTurbo) {
        this.enginePower = enginePower;
        this.trimFactor = trimFactor;
        if (!carTurbo) {
            this.carTurbo = Optional.empty();
        } else if (carTurbo) {
            this.carTurbo = Optional.of(new CarTurbo(false));
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

    public boolean hasATurbo() {
        if (carTurbo.isPresent()) {
            return true;
        }
        return false;
    }

    public boolean isTurboOn() {
        if (hasATurbo()) {
            return carTurbo.get().isTurboOn();
        } else if (!hasATurbo()) {
            System.out.println("CarTurbo: N/A");
        }
        return false;
    }

    public double speedFactor() {
        if (this.carTurbo.isPresent()) {
            double turbo = 1;
            if (this.carTurbo.get().isTurboOn()) {
                turbo = 1.3;
            }
            return getEnginePower() * 0.01 * turbo;
        } else {
            return this.getEnginePower() * 0.01 * getTrimFactor();
        }
    }
}
