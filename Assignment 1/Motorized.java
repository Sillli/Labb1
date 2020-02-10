public abstract class Motorized<T extends Engine> extends Movable {

    protected Chassi chassi;
    protected T engine;

    public Motorized() {

    }


    /**
     * A method that uses the decrementSpeed method to lower the speed of the car.
     *
     * @param amount in the form of a double
     */
    public void brake(double amount) {
        if (amount >= 1) {
            amount = 1;
        } else if (amount <= 0) {
            amount = 0;
        }
        decrementSpeed(amount);
    }

    /**
     * A method that uses the incrementSpeed method to increas the speed of the car.
     *
     * @param amount in the form of a double
     */
    public void gas(double amount) {
        if (amount >= 1) {
            amount = 1;
        } else if (amount <= 0) {
            amount = 0;
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
        speedFactor();
        increment= (getCurrentSpeed() + speedFactor()*amount);
        return increment;
    }

    /**
     * Calculates the decrement of speed using helper function decrementHelper and 0, the 0 represents a car that is not moving.
     *
     * @param amount difference in speed
     */
    public void decrementSpeed(double amount) {
        currentSpeed = Math.max(decrementHelper(amount), 0);
    }

    /**
     * Calculates the increment of the speed by using helper function incrementHelper and getEnginePower
     * chooses the one with the lowest value of the two of them.
     *
     * @param amount difference in speed
     */
    public void incrementSpeed(double amount) {
        currentSpeed = Math.min(incrementHelper(amount), engine.getEnginePower());
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
     * Setter methods that sets the enginePower of the car
     *
     * @param enginePower in the form of double
     */
    public void setEnginePower(double enginePower) {
        getEngine().setEnginePower(enginePower);
    }


    public T getEngine() {
        return engine;
    }

    public double getEnginePower() {
        return getEngine().getEnginePower();
    }

    @Override
    public void move() {

    }
}
