import java.awt.*;

public class CarTransporter extends Truck {

    private final static double trimFactor = 1.10;

    public CarTransporter() {
        super(0, 1, 0, 0, 2, 400, 0, Color.black,
                "Mercedes");
        this.flatbed = new Flatbed();
    }

    @Override
    public double speedFactor() {
        return getEnginePower() * 0.01 * trimFactor;
    }

    public void tipFlatbed() {
        if (getCurrentSpeed() != 0) {
            //DO NOTHING
        } else if (getCurrentSpeed() == 0) {
            flatbed.setFlatbedAngle(70);
        }
    }

    public void lowerFlatbed() {
        if (getCurrentSpeed() != 0) {
            //DO NOTHING
        } else if (getCurrentSpeed() == 0 && flatbed.getFlatbedAngle() > 0) {
            flatbed.setFlatbedAngle(0);
        }
    }
}
