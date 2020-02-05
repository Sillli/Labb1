import java.awt.*;
import java.util.Stack;

public class CarTransporter extends Truck implements IStorable {

    private final int maxLoadedCars = 6;
    private final static double trimFactor = 1.10;
    private Stack<Car> stack = new Stack<>();

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

    @Override
    public void onLoadingCar(Car car) {
        if(this.getDistanceX(car) <=2 && this.getDistanceY(car)<=2 && flatbed.getFlatbedAngle()==0){
            stack.add(car);
        }


    }

    @Override
    public void offLoadingCar(Car car) {

    }
}
