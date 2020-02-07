/**
 * A class that contains positions and directions.
 * Can be used by any class that is in need of this.
 * Contains setters and getters.
 */

public class Position {

    public double PosX;
    public double PosY;
    public int DirX;
    public int DirY;

    public Position(double posX, double posY, int dirX, int dirY) {
        PosX = posX;
        PosY = posY;
        DirX = dirX;
        DirY = dirY;
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
