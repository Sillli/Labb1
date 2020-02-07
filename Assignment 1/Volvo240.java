import java.awt.*;

/**
 * Class describing Volvo240 its unique attributes
 */
public class Volvo240 extends Car {

    public Volvo240() {
        super("Volvo240");
        this.engine = new EngineTrim(100,1.25);
        this.caross = new Caross(4,Color.black);
        stopEngine();
    }
}

