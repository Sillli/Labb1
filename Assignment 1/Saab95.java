import java.awt.*;
import java.util.LinkedList;
import java.util.List;

/**
 * A subclass to car that describes Saab95.
 */
public class Saab95 extends Car {

    public Saab95() {
        super("Saab95");
        this.position = new Position(0, 0);
        this.caross = new Caross(2, Color.red);
        this.engine = new EngineWithTurbo(125);
        stopEngine();
    }
}