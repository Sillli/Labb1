import java.awt.*;
import java.util.Scanner;

public class Scania extends Truck {


    /**
     * constructor of the class Scania, sets it unique attributes
     */
    public Scania() {
        this.modelName = "Scania";
        this.chassi = new Chassi(2, Color.red);
        this.engine = new Engine(400,1,true);
        this.position = new Position(0, 0, 0, 1);
        this.flatbed = new Flatbed();

    }

    /**
     * method that tips the flatbed, has a few conditions
     * if the Scania is moving this can not happen
     * if the Scania already has the flatbed up it can move the flatbed further
     */

    public void tipFlatbed() {
        if (getCurrentSpeed() != 0) {
            //DO NOTHING
        } else if (getCurrentSpeed() == 0 && getFlatbedAngle() != 70) {
            setFlatbedAngle(70);
        }
    }

    /**
     * Method that decides if the flatbed can be lowered.
     */
    public void lowerFlatbed() {
        if (getCurrentSpeed() != 0) {
            //DO NOTHING
        } else if (getCurrentSpeed() == 0 && getFlatbedAngle() >= 0) {
            setFlatbedAngle(0);
        }
    }


    /**
     * getting the angle of the flatbed, 0 or 70
     *
     * @return flatbedAngle, shows if the angle is up or down
     */
    public double getFlatbedAngle() {
        return flatbed.getFlatbedAngle();
    }

    /**
     * setting the angle of the flatbed, either to  0 or 70
     *
     * @param flatbedAngle the angle the flatbed is gonna get
     */
    public void setFlatbedAngle(double flatbedAngle) {
        if (flatbedAngle >= 0 && flatbedAngle <= 70) {
            this.flatbed.setFlatbedAngle(flatbedAngle);
        }

    }

}
