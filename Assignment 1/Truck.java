import java.awt.*;

public abstract class Truck extends Movable {

    private double flatbedAngle;

    /***
     * A constructor of a Flatbed object
     */
    public Truck(int dirX, int dirY, int posX, int posY, int nrDoors, double enginePower, double currentSpeed,
                 Color color, String modelName) {
        super(dirX, dirY, posX, posY, nrDoors, enginePower, currentSpeed,
                color, modelName);
        setFlatbedAngle(0);
    }

    /**
     * setting the angle of the flatbed
     *
     * @param flatbedAngle the angle the flatbed is gonna get
     */

    public void setFlatbedAngle(double flatbedAngle) {

        this.flatbedAngle = flatbedAngle;
    }

    /**
     * getting the angle of the flatbed
     *
     * @return flatbedAngle, shows if the angle is up or down
     */
    public double getFlatbedAngle() {
        return flatbedAngle;
    }

   /*
    public void lowerFlatbed(double degree) {
        if(degree >= 0 && degree <= 70) {
            setFlatbedAngle(degree);
        }
    }

    /*
    public void tipFlatbed(double degree){
        if (degree >= 0 && degree <= 70){
            setFlatbedAngle(degree);
        }
    }*/


}
