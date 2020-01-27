import java.awt.*;

public class Saab95 extends Car {
    private boolean turboOn;

    public Saab95() {
        setNrDoors(2);
        setColor(Color.red);
        setEnginePower(125);
        turboOn = false;
        setModelName("Saab95");
        stopEngine();
    }

    @Override
    public double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }
    @Override
    public void incrementSpeed(double amount){
        incrementHelper(amount);
    }
    @Override
    public void decrementSpeed(double amount){
        decrementHelper(amount);
    }




}