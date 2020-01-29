public abstract class Vehicle implements Movable {

    private double dirX;
    private double dirY;
    private double posX;
    private double posY;

    public Vehicle(int dirX, int dirY, double posX, double posY) {
        this.dirX = dirX;
        this.dirY = dirY;
        this.posX = posX;
        this.posY = posY;
    }

    public void setDirX(int dirX) {
        this.dirX = dirX;
    }

    public void setDirY(int dirY) {
        this.dirY = dirY;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public double getDirX() {
        return dirX;
    }

    public double getDirY() {
        return dirY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }


}
