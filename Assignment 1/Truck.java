import java.awt.*;

public abstract class Truck extends Movable{
    protected Flatbed flatbed;


    /***
     * A constructor of a Flatbed object
     */
    public Truck(int dirX, int dirY, int posX, int posY, int nrDoors, double enginePower, double currentSpeed,
                 Color color, String modelName) {
        super();


    }

    /**
     * Checks if the flatbed is up, and if it is the scania can not move and a "error message" prints out
     * if the flatbed is down the car can move
     */
    @Override
    public void move() {
        if (flatbed.getFlatbedAngle() != 0) {
            setCurrentSpeed(0);
            System.out.println("Flatbed is up");
        } else if (flatbed.getFlatbedAngle() == 0) {
            if (position.getDirX() != 0) {
                position.setPosX( (position.getPosX() + position.getDirX() * getCurrentSpeed()));
            } else if (position.getDirY() != 0) {
                position.setPosY( (position.getPosY() + position.getDirY() * getCurrentSpeed()));
            }
        }
    }


}
