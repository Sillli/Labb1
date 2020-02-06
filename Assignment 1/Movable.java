import java.awt.*;

/**
 *  Class that holds directions and positions
 *  Implements the interface Movable
 */
public abstract class Movable implements IMovable {
    /**
     * initiates directions and positions
     */
    private int dirX;
    private int dirY;
    private double posX;
    private double posY;

    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    /**
     * constructor for the Class
     * @param dirX the value of direction in x-axis
     * @param dirY the value of direction in y-axis
     * @param posX the value of the positions x value
     * @param posY the value of the positions y value
     */
    public Movable(int dirX, int dirY, int posX, int posY,int nrDoors, double enginePower, double currentSpeed,
                   Color color, String modelName) {
        this.dirX = dirX;
        this.dirY = dirY;
        this.posX = posX;
        this.posY = posY;
        this.nrDoors=nrDoors;
        this.enginePower=enginePower;
        this.currentSpeed= currentSpeed;
        this.color = color;
        this.modelName=modelName;
    }

    public double getDistanceX(Movable other){
       double distanceX = Math.abs(other.getPosX()-this.getPosX());
       return distanceX;
    }
    public double getDistanceY(Movable other){
        double distanceY = Math.abs(other.getPosY()-this.getPosY());
        return distanceY;
    }

    /**
     * setter for the X-direction of the car
     * @param dirX the direction x value
     */
    public void setDirX(int dirX) {
        this.dirX = dirX;
    }

    /**
     * Setter for the Y-direction of the car
     * @param dirY the direction y value
     */
    public void setDirY(int dirY) {
        this.dirY = dirY;
    }

    /**
     * setter for the position on the x-axis a coordinant plane for the car
     * @param posX the positions x value
     */
    public void setPosX(double posX) {
        this.posX = posX;
    }

    /**
     * setter for the position on the y-axis a cordinant plane for the car
     * @param posY the positions y value
     */

    public void setPosY(double posY) {
        this.posY = posY;
    }

    /**
     * getter for the direction X
     * @return x directional value
     */
    public double getDirX() {
        return dirX;
    }

    /**
     * getter for the direction Y
     * @return y directional value
     */
    public double getDirY() {
        return dirY;
    }

    /**
     * getter for the position on the X-axis on the coordinant plane
     * @return x positional value
     */
    public double getPosX() {
        return posX;
    }

    /**
     * getter for the position on the y-axis on the coordinant plane
     * @return y positional value
     */
    public double getPosY() {
        return posY;
    }
    /**
     * A method that changes the direction of the car to the left by 90 degrees
     */
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
    public abstract void move();

    /**
     * A method that uses the decrementSpeed method to lower the speed of the car.
     *
     * @param amount in the form of a double
     */
    public void brake(double amount) {
        if (amount >=1){
            amount =1;
        }else if (amount <= 0){
            amount=0;
        }
        decrementSpeed(amount);
    }
    /**
     * A method that uses the incrementSpeed method to increas the speed of the car.
     *
     * @param amount in the form of a double
     */
    public void gas(double amount) {
        if (amount >=1){
            amount=1;
        }else if (amount <= 0){
            amount=0;
        }
        incrementSpeed(amount);
    }
    /**
     * A helper method for decrementSpeed methods that takes a
     *
     * @param amount in the for of a double and
     * @return returns a double
     */
    public double decrementHelper(double amount) {
        double decrement;
        decrement = (getCurrentSpeed() - speedFactor() * amount);
        return decrement;
    }
    public double incrementHelper(double amount){
        double increment;
        increment= (getCurrentSpeed() + speedFactor()*amount);
        return increment;
    }
    /**
     * A method that sets the current speed to 0
     */
    public void stopEngine() {
        currentSpeed = 0;
    }
    /**
     * A method that sets the currentSpeed to a starting value of 0.1
     */
    public void startEngine() {
        currentSpeed = 0.1;
    }
    /**
     * Calculates the decrement of speed using helper function decrementHelper and 0, the 0 represents a car that is not moving.
     *
     * @param amount
     */
    public void decrementSpeed(double amount) {
        currentSpeed = Math.max(decrementHelper(amount), 0);
    }

    /**
     * Calculates the increment of the speed by using helper function incrementHelper and getEnginePower
     * chooses the one with the lowest value of the two of them.
     *
     * @param amount
     */
    public void incrementSpeed(double amount) {
        currentSpeed = Math.min(incrementHelper(amount), getEnginePower());
    }

    /**
     * speedFactor() is part of the calculation of the speed of a car
     *
     * @return return a double value
     */
    public abstract double speedFactor();



    /**
     * A setter method that sets the car models name
     *
     * @param modelName in the form of a string
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    /**
     * A getter Methods that gives the car modelsName
     *
     * @return as string
     */
    public String getModelName() {
        return modelName;
    }
    /**
     * A getter method that
     *
     * @return returns the number of doors of the car
     */
    public int getNrDoors() {
        return nrDoors;
    }
    /**
     * Setter method that sets the Number of doors of the car
     *
     * @param nrDoors in int
     */
    public void setNrDoors(int nrDoors) {
        this.nrDoors = nrDoors;
    }
    /**
     * A getter method that gives you the enginePower of the car
     *
     * @return returns as a double
     */
    public double getEnginePower() {
        return enginePower;
    }
    /**
     * Setter methods that sets the enginePower of the car
     *
     * @param enginePower in the form of double
     */
    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    /**
     * A method that sets the currentSpeed
     *
     * @param currentSpeed in the form of int
     */
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    /**
     * A getter method that gives you the currentSpeed of the car
     *
     * @return returns the speed in the form of a double
     */
    public double getCurrentSpeed() {
        return currentSpeed;
    }
    /**
     * A getter method that returns the colour of the car
     *
     * @return returns a colour
     */
    public Color getColor() {
        return color;
    }
    /**
     * A setter method that sets the colour of the car
     *
     * @param clr Color
     */
    public void setColor(Color clr) {
        color = clr;
    }

}
