import java.awt.*;
import java.util.Deque;
import java.util.LinkedList;

public class Ferry extends Movable implements IStoreCars {
    private Deque<Car> cars = new LinkedList<>();
    private Caross hull;
    private Engine engine;

    private final int maxCars;

    public Ferry(int maxCars, int nrdoors, Color color, double enginepower, double trimfactor, boolean carturbo) {
        this.maxCars = maxCars;
        this.hull = new Caross(nrdoors, color);
        this.engine = new Engine(enginepower, trimfactor, carturbo);

    }


    @Override
    public void onLoadingCar(Car car) {
        while (cars.size() < maxCars) {
            cars.addLast(car);
        }

    }

    @Override
    public void offLoadingCar() {
        while (cars.size() > 0) {
            cars.pop();
        }

    }

    @Override
    public void move() {
        if (position.getDirX() != 0) {
            position.setPosX( (position.getPosX() + position.getDirX() * getCurrentSpeed()));
        } else if (position.getDirY() != 0) {
            position.setPosY( (position.getPosY() + position.getDirY() * getCurrentSpeed()));
        }
    }
}

