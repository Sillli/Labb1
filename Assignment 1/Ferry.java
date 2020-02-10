import java.awt.*;
import java.util.Deque;
import java.util.LinkedList;

public class Ferry extends Motorized<Engine> implements IStoreCars {

    private Deque<Car> cars = new LinkedList<>();

    private Chassi hull;
    private Engine engine;
    private final int maxCars;

    public Ferry(int maxCars, int nrdoors, Color color, double enginepower) {
        this.position = new Position(0,0,0,1);
        this.maxCars = maxCars;
        this.hull = new Chassi(nrdoors, color);
        this.engine = new Engine(enginepower);

    }

    /**
     * Onloads car to ferry if there is still room
     * Adds car at the tail of the queue.
     * @param car to be added to queue
     */
    @Override
    public void onLoadingCar(Car car) {
        if(cars.size() < maxCars) {
            cars.addLast(car);
        }
    }

    /**
     * if there is still car on the ferry it will offload the first in the queue
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

