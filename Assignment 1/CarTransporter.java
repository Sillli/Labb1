import java.awt.*;
import java.util.Stack;

public class CarTransporter extends Truck implements IStoreCars {

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
        if (this.position.getDistanceX(car.position) <= 2 && this.position.getDistanceY(car.position) <= 2 && flatbed.getFlatbedAngle() == 70
                && stack.size() < maxLoadedCars) {
            stack.add(car);
        }
    }

    @Override
    public void offLoadingCar() {
        if(flatbed.getFlatbedAngle()==70 && stack.size()>0){
            for (int i=0; i <stack.size(); i++){
                (stack.pop()).position.setPosX((int) (position.getPosX()+1+i));

            }
        }
    }

    @Override
    public void move(){
        super.move();
        transported();
    }

    public void transported(){
        for (Car car: stack) {
            car.position.setPosX (this.position.getPosX());
            car.position.setPosY(this.position.getPosY());
        }
    }
}
