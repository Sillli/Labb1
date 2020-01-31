/**
 *  Class that holds directions and positions
 *  Implements the interface Movable
 */
public abstract class Vehicle implements Movable {
    /**
     * initiates directions and positions
     */
    private int dirX;
    private int dirY;
    private int posX;
    private int posY;

    /**
     * constructor for the Class
     * @param dirX
     * @param dirY
     * @param posX
     * @param posY
     */
    public Vehicle(int dirX, int dirY, int posX, int posY) {
        this.dirX = dirX;
        this.dirY = dirY;
        this.posX = posX;
        this.posY = posY;
    }

    /**
     * setter for the X-direction of the car
     * @param dirX
     */
    public void setDirX(int dirX) {
        this.dirX = dirX;
    }

    /**
     * Setter for the Y-direction of the car
     * @param dirY
     */
    public void setDirY(int dirY) {
        this.dirY = dirY;
    }

    /**
     * setter for the position on the x-axis a cordinant plane for the car
     * @param posX
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * setter for the position on the y-axis a cordinant plane for the car
     * @param posY
     */

    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * getter for the direction X
     * @return
     */
    public double getDirX() {
        return dirX;
    }

    /**
     * getter for the direction Y
     * @return
     */
    public double getDirY() {
        return dirY;
    }

    /**
     * getter for the position on the X-axis on the coordinant plane
     * @return
     */
    public double getPosX() {
        return posX;
    }

    /**
     * getter for the position on the y-axis on the coordinant plane
     * @return
     */
    public double getPosY() {
        return posY;
    }


}
