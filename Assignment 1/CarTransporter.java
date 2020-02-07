import java.awt.*;
import java.util.Stack;

public class CarTransporter extends Truck implements IStoreCars {

    private final int maxLoadedCars = 6;
    public EngineWithTurbo engine;
    public Stack<Car> stack = new Stack<>();

    public CarTransporter() {
        super("Mercedes");
        this.position = new Position(0,0,0,1);
        this.flatbed = new Flatbed();
        this.engine = new EngineWithTurbo(400);
        this.chassi = new Chassi(2,Color.red);

    }

    /**
     * When the transporter doesn't move it will be possible to tip the flatbed 70 degrees.
     */
    public void tipFlatbed() {
        if (getCurrentSpeed() != 0) {
            //DO NOTHING
        } else if (getCurrentSpeed() == 0) {
            flatbed.setFlatbedAngle(70);
        }
    }

    /**
     *When the transporter doesn't move it will be possible to lower the flatbed to 0 degrees.
     */
    public void lowerFlatbed() {
        if (getCurrentSpeed() != 0) {
            //DO NOTHING
        } else if (getCurrentSpeed() == 0 && flatbed.getFlatbedAngle() > 0) {
            flatbed.setFlatbedAngle(0);
        }
    }

    /**
     * This method checks if the car that is going to get loaded is close enough.
     * If it is then it will get loaded onto the transporter.
     * @param car is the object that is getting loaded onto the transporter.
     */
    @Override
    public void onLoadingCar(Car car) {
        if (this.position.getDistanceX(car.position) <= 2 && this.position.getDistanceY(car.position) <= 2 && flatbed.getFlatbedAngle() == 70
                && stack.size() < maxLoadedCars) {
            stack.add(car);
        }
    }

    /**
     * If the angle of the flatbed is 70 & there is still cars to offload then it will keep offloading them.
     * The transporter will drop it of 1 length unit away from the previous car.
     */
    @Override
    public void offLoadingCar() {
        if (flatbed.getFlatbedAngle() == 70 && stack.size() > 0) {
            for (int i = 0; i < stack.size(); i++) {
                (stack.pop()).position.setPosX((int) (position.getPosX() + 1 + i));

            }
        }
    }

    /**
     *Uses the move method in the class Truck
     */
    @Override
    public void move() {
        super.move();
        transported();
    }

    /**
     * Makes sure that the car follows the transporters rout and ends up where the transporter drops it off.
     */
    public void transported() {
        for (Car car : stack) {
            car.position.setPosX(this.position.getPosX());
            car.position.setPosY(this.position.getPosY());
        }
    }
}
