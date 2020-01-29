
import java.awt.*;


/**
 * An abstract class representing a Car that extends the abstract class Vehicle
 * Contains the attributes common between cars
 */

public abstract class Car extends Vehicle {

    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name


    /**
     * A constructor that's used by subclasses to the Car
     */
    public Car() {
        super(0, 1, 0, 0);

    }

    /**
     * speedFactor() is part of the calculation of the speed of a car
     * @return return a double value
     */
    public abstract double speedFactor();

    /**
     * A abstract method that takes a
     * @param amount in the form of a double
     */
    public abstract void incrementSpeed(double amount);

    /**
     * A abstract method that takes a
     * @param amount in form of a double
     */
    public abstract void decrementSpeed(double amount);

    /**
     * A method that sets the currentSpeed to a starting value of 0.1
     */
    public void startEngine() {
        currentSpeed = 0.1;
    }

    /**
     * A method that sets the current speed to 0
     */
    public void stopEngine() {
        currentSpeed = 0;
    }

    /**
     * A helper method for the incrementSpeed method that takes a
     * @param amount in the for of a double and
     * @return returns a double
     */
    public double incrementHelper(double amount) {
        double increment;
        increment = (getCurrentSpeed() + speedFactor() * amount);
        return increment;
    }

    /**
     * A helper method for decrementSpeed methods that takes a
     * @param amount in the for of a double and
     * @return returns a double
     */
    public double decrementHelper(double amount) {
        double decrement;
        decrement = (getCurrentSpeed() - speedFactor() * amount);
        return decrement;
    }

    /**
     * A method that uses the incrementSpeed method to increas the speed of the car.
     * @param amount in the form of a double
     */
    public void gas(double amount) {
        incrementSpeed(amount);
    }

    /**
     * A method that uses the decrementSpeed method to lower the speed of the car.
     * @param amount in the form of a double
     */
    public void brake(double amount) {
        decrementSpeed(amount);
    }

    /**
     * A Method that moves the cars position with the rate of the currentSpeed of the car
     */
    @Override
    public void move() {
        if (getDirX() != 0) {
            setPosX((int) (getPosX() + getDirX() * getCurrentSpeed()));
        } else if (getDirY() != 0) {
            setPosY((int) (getPosY() + getDirY() * getCurrentSpeed()));
        }
    }

    /**
     * A method that changes the direction of the car to the left by 90 degrees
     */
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

    /**
     * A method that changes the direction of the car to the right by 90 degrees
     */
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

    /**
     * Setter method that sets the Number of doors of the car
     * @param nrDoors in int
     */
    public void setNrDoors(int nrDoors) {
        this.nrDoors = nrDoors;
    }

    /**
     * Setter methods that sets the enginePower of the car
     * @param enginePower in the form of double
     */
    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    /**
     * A method that sets the currentSpeed
     * @param currentSpeed in the form of int
     */
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    /**
     * A getter Methods that gives the car modelsName
     * @return  as string
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * A setter method that sets the car models name
     * @param modelName in the form of a string
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * A getter method that
     * @return returns the number of doors of the car
     */
    public int getNrDoors() {
        return nrDoors;
    }

    /**
     * A getter method that gives you the enginePower of the car
     * @return returns as a double
     */
    public double getEnginePower() {
        return enginePower;
    }

    /**
     * A getter method that gives you the currentSpeed of the car
     * @return returns the speed in the form of a double
     */
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    /**
     * A getter method that returns the colour of the car
     * @return returns a colour
     */
    public Color getColor() {
        return color;
    }

    /**
     * A setter method that sets the colour of the car
     * @param clr Color
     */
    public void setColor(Color clr) {
        color = clr;
    }


}
