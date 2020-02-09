import java.awt.*;
import java.util.Deque;
import java.util.LinkedList;

public class Ferry extends Movable implements IStoreCars {

    private Deque<Car> cars = new LinkedList<>();

    private Chassi hull;
    private Engine engine;
    private final int maxCars;

    public Ferry(int maxCars, int nrdoors, Color color, double enginepower) {
        this.position = new Position(0,0,0,1);
        this.maxCars = maxCars;
        this.hull = new Chassi(nrdoors, color);
        this.engine = new Engine(enginepower,1,false);

    }

    /**
     * While the there is still room for cars will keep adding them.
     * Will push the first car added to the first position.
     * @param car
     */
    @Override
    public void onLoadingCar(Car car) {
        if(cars.size() < maxCars) {
            cars.addLast(car);
        }
    }

    /**
     * While there is still car on the ferry it will keep offloading cars
     */
    @Override
    public void offLoadingCar() {
        if (cars.size() > 0) {
            cars.pop();
        }
    }

    /**
     * A method that will move the ferry the same way as the method for car.
     */
    @Override
    public void move() {
        if (position.getDirX() != 0) {
            position.setPosX( (position.getPosX() + position.getDirX() * getCurrentSpeed()));
        } else if (position.getDirY() != 0) {
            position.setPosY( (position.getPosY() + position.getDirY() * getCurrentSpeed()));
        }
    }

    public Deque<Car> getCars() {
        return cars;
    }

    public int getMaxCars() {
        return maxCars;
    }
}
