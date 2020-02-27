/**
 *  Class that holds directions and positions
 *  Implements the interface Movable
 */
public abstract class Movable implements IMovable {


    /**
     * initiates directions and positions
     */

    protected Position position;
    protected double currentSpeed; // The current speed of the car
    protected String modelName; // The car model name

    protected int DirX;
    protected int DirY;


    public Movable() {
        this.DirX =1;
        this.DirY=0;
        this.currentSpeed = 0;
    }

    @Override
    public void turnRight() {
        if (getDirX() == -1 && getDirY() == 0) {
            setXYDir(0,-1);
        } else if (getDirX() == 0 && getDirY() == -1) {
            setXYDir(1,0);
        } else if (getDirX() == 1 && getDirY() == 0) {
            setXYDir(0,1);
        } else if (getDirX() == 0 && getDirY() == 1) {
            setXYDir(-1,0);
        }
    }
    @Override
    public void turnLeft() {

        if (getDirX() == -1 && getDirY() == 0) {
            setXYDir(0,1);
        } else if (getDirX() == 0 && getDirY() == -1) {
            setXYDir(-1,0);
        } else if (getDirX() == 1 && getDirY() == 0) {
            setXYDir(0,-1);
        } else if (getDirX() == 0 && getDirY() == 1) {
            setXYDir(1,0);

        }
    }
    public void setXYDir(int x, int y){
        setDirY(y);
        setDirX(x);
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


    public int getDirX() {
        return DirX;
    }

    public void setDirX(int dirX) {
        DirX = dirX;
    }

    public int getDirY() {
        return DirY;
    }

    public void setDirY(int dirY) {
        DirY = dirY;
    }



}
