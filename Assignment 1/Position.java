/**
 * A class that contains positions and directions.
 * Can be used by any class that is in need of this.
 * Contains setters and getters.
 */

public class Position {

    protected double PosX;
    protected double PosY;


    public Position(double posX, double posY) {
        PosX = posX;
        PosY = posY;

    }

    public double getPosX() {
        return PosX;
    }

    public void setPosX(double posX) {
        PosX = posX;
    }

    public double getPosY() {
        return PosY;
    }

    public void setPosY(double posY) {
        PosY = posY;
    }

    public double getDistanceX(Position other) {
        return Math.abs(other.getPosX() - this.getPosX());
    }

    public double getDistanceY(Position other) {
        return Math.abs(other.getPosY() - this.getPosY());
    }
}
