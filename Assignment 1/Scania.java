import java.util.Scanner;

public class Scania extends Car {

    private double flatbedAngle;
    private final static double trimFactor = 1.10;

    public Scania() {
        setEnginePower(400);
        setModelName("Scania");
        setNrDoors(2);

        this.flatbedAngle = 0;
    }

    public void tipFlatbed() {
        if (getCurrentSpeed() != 0) {
            //DO NOTHING
        } else if (getCurrentSpeed() == 0 && getFlatbedAngle() != 70) {
            setFlatbedAngle(70);
        }
    }

    public void lowerFlatbed() {
        if (getCurrentSpeed() != 0) {
            //DO NOTHING
        } else if (getCurrentSpeed() == 0 && getFlatbedAngle() >= 0) {
            setFlatbedAngle(0);
        }
    }

    public double getFlatbedAngle() {
        return flatbedAngle;
    }

    public void setFlatbedAngle(double flatbedAngle) {
        this.flatbedAngle = flatbedAngle;
    }

    @Override
    public double speedFactor() {
        return getEnginePower()*0.01*trimFactor;
    }

    @Override
    public void move() {
        if (getFlatbedAngle() != 0) {
            setCurrentSpeed(0);
            System.out.println("Flatbed is up");
        } else if (getFlatbedAngle() == 0) {
            super.move();
        }
    }


}
