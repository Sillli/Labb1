
import java.awt.*;

public abstract class Car extends Vehicle {

    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name

/*
    public final static double trimFactor = 1.25;
    public boolean turboOn;
    */

    public Car() {
        super(0, 1, 0, 0);

    }

    public abstract double speedFactor();

    public abstract void incrementSpeed(double amount);

    public abstract void decrementSpeed(double amount);


    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }


    public double incrementHelper(double amount) {
        double increment;
        increment = (getCurrentSpeed() + speedFactor() * amount);
        return increment;
    }


    public double decrementHelper(double amount) {
        double decrement;
        decrement = (getCurrentSpeed() - speedFactor() * amount);
        return decrement;
    }

    public void gas(double amount) {
        incrementSpeed(amount);
    }

    public void brake(double amount) {
        decrementSpeed(amount);
    }


    @Override
    public void move() {
        if (getDirX() != 0) {
            setPosX((int) (getPosX() + getDirX() * getCurrentSpeed()));
        } else if (getDirY() != 0) {
            setPosY((int) (getPosY() + getDirY() * getCurrentSpeed()));
        }
    }

    @Override
    public void turnLeft() {

        if (getDirX() == -1 && getDirY() == 0) {
            setDirX(0);
            setDirY(-1);
        } else if (getDirX() == 0 && getDirY() == -1) {
            setDirX(1);
            setDirY(0);
        } else if (getDirX() == 1 && getDirY() == 0) {
            setDirX(0);
            setDirY(1);
        } else if (getDirX() == 0 && getDirY() == 1) {
            setDirX(-1);
            setDirY(0);
        }
    }

    @Override
    public void turnRight() {
        if (getDirX() == -1 && getDirY() == 0) {
            setDirX(0);
            setDirY(1);
        } else if (getDirX() == 0 && getDirY() == -1) {
            setDirX(-1);
            setDirY(0);
        } else if (getDirX() == 1 && getDirY() == 0) {
            setDirX(0);
            setDirY(-1);
        } else if (getDirX() == 0 && getDirY() == 1) {
            setDirX(1);
            setDirY(0);
        }
    }


    public void setNrDoors(int nrDoors) {
        this.nrDoors = nrDoors;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }


    public int getNrDoors() {
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }


}
