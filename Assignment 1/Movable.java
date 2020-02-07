import java.awt.*;

/**
 *  Class that holds directions and positions
 *  Implements the interface Movable
 */
public abstract class Movable implements IMovable {
    /**
     * initiates directions and positions
     */

    public Position position;
    public Chassi chassi;
    public Engine engine;
    protected double currentSpeed; // The current speed of the car
    private String modelName; // The car model name

    public Movable() {
        this.currentSpeed= 0;
    }

    @Override
    public void turnRight() {
        if (position.getDirX() == -1 && position.getDirY() == 0) {
            setXYDir(-1,0);
        } else if (position.getDirX() == 0 && position.getDirY() == -1) {
            setXYDir(-1,0);
        } else if (position.getDirX() == 1 && position.getDirY() == 0) {
            setXYDir(0,1);
        } else if (position.getDirX() == 0 && position.getDirY() == 1) {
            setXYDir(1,0);
        }
    }
    @Override
    public void turnLeft() {

        if (position.getDirX() == -1 && position.getDirY() == 0) {
            setXYDir(0,-1);
        } else if (position.getDirX() == 0 && position.getDirY() == -1) {
            setXYDir(1,0);
        } else if (position.getDirX() == 1 && position.getDirY() == 0) {
            setXYDir(0,1);
        } else if (position.getDirX() == 0 && position.getDirY() == 1) {
            setXYDir(-1,0);

        }
    }
    public void setXYDir(int x, int y){
        position.setDirY(y);
        position.setDirX(x);
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
        decrement = (getCurrentSpeed() - engine.speedFactor() * amount);
        return decrement;
    }
    public double incrementHelper(double amount){
        double increment;
        increment= (this.getCurrentSpeed() + engine.speedFactor()*amount);
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
        currentSpeed = Math.min(incrementHelper(amount), engine.getEnginePower());
    }

    /**
     * speedFactor() is part of the calculation of the speed of a car
     *
     * @return return a double value
     */
    public double speedFactor(){
        return engine.speedFactor();
    }

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

    public double getEnginePower() {
        return engine.getEnginePower();
    }
    /**
     * Setter methods that sets the enginePower of the car
     *
     * @param enginePower in the form of double
     */
    public void setEnginePower(double enginePower) {
        engine.setEnginePower(enginePower);
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
        return this.currentSpeed;
    }

}
