import java.awt.*;
import java.util.Scanner;

public class Scania extends Truck<EngineTurbo> {

    /**
     * constructor of the class Scania, sets it unique attributes
     */

    private FlatbedState FlatbedDown = new FlatbedDown();
    private FlatbedState FlatbedUp = new FlatbedUp();
    private FlatbedState currentState;

    public Scania() {
        currentState = FlatbedDown;
        this.modelName = "Scania";
        this.chassi = new Chassi(2, Color.red);
        this.engine = new EngineTurbo(400);
        this.position = new Position(0, 0);
        this.flatbed = new Flatbed();


    }

    /**
     * method that tips the flatbed, has a few conditions
     * if the Scania is moving this can not happen
     * if the Scania already has the flatbed up it can move the flatbed further
     */

    public void tipFlatbed() {
        if(getCurrentSpeed()==0){
       setFlatbedState(FlatbedUp);
       stopEngine();
       setFlatbedAngle(70);
        }}


    /**
     * Method that decides if the flatbed can be lowered.
     */
    public void lowerFlatbed() {
        if(getCurrentSpeed()==0){
        setFlatbedState(FlatbedDown);
        stopEngine();
        setFlatbedAngle(0);
        }}



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
    private void setFlatbedAngle(double flatbedAngle) {
        if (flatbedAngle >= 0 && flatbedAngle <= 70) {
            this.flatbed.setFlatbedAngle(flatbedAngle);
        }

    }
    public void setFlatbedState(FlatbedState State){
        currentState=State;

    }

}
