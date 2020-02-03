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
    private int posX;
    private int posY;

    /**
     * constructor for the Class
     * @param dirX the value of direction in x-axis
     * @param dirY the value of direction in y-axis
     * @param posX the value of the positions x value
     * @param posY the value of the positions y value
     */
    public Movable(int dirX, int dirY, int posX, int posY) {
        this.dirX = dirX;
        this.dirY = dirY;
        this.posX = posX;
        this.posY = posY;
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
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * setter for the position on the y-axis a cordinant plane for the car
     * @param posY the positions y value
     */

    public void setPosY(int posY) {
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


}
