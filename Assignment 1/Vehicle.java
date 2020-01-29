public abstract class Vehicle implements Movable {

    private int dirX;
    private int dirY;
    private int posX;
    private int posY;

    public Vehicle(int dirX, int dirY, int posX, int posY) {
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

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
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
