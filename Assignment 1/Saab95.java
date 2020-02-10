import java.awt.*;
import java.util.LinkedList;
import java.util.List;

/**
 * A subclass to car that describes Saab95.
 */
public class Saab95 extends Car<EngineTurbo> {


    public Saab95() {
        this.modelName = "Saab95";
        this.position = new Position(0, 0, 0, 1);
        this.chassi = new Chassi(2, Color.red);
        this.engine = new EngineTurbo(125);
        //this.currentSpeed = 0;
        stopEngine();
    }
}