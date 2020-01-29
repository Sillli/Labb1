import java.awt.*;

public class Volvo240 extends Car {

    public Volvo240() {
        setNrDoors(4);
        setColor(Color.black);
        setEnginePower(100);
        setModelName("Volvo240");
        stopEngine();

    }

    private final static double trimFactor = 1.25;

    @Override
    public double speedFactor() {
        return getEnginePower() * 0.01 * trimFactor;
    }

    @Override
    public void incrementSpeed(double amount) {
        currentSpeed = Math.min(incrementHelper(amount), getEnginePower());
    }

    @Override
    public void decrementSpeed(double amount) {
        currentSpeed = Math.max(decrementHelper(amount), 0);
    }
}

