/**
 *  Class that holds directions and positions
 *  Implements the interface Movable
 */
public abstract class Movable implements IMovable {


    /**
     * initiates directions and positions
     */

    public Position position;
   // public Chassi chassi;
    //public T engine;
    public double currentSpeed; // The current speed of the car
    protected String modelName; // The car model name

    public Movable() {
        this.currentSpeed = 0;
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
     * A method that sets the currentSpeed
     *
     * @param currentSpeed in the form of int
     */
    public void setCurrentSpeed( double currentSpeed) {
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


}
