import java.awt.*;
import java.util.Deque;
import java.util.LinkedList;

public class Ferry implements IStoreCars {

    private  Caross caross;
    private Engine engine;

    private final int maxCars;

    public Ferry (int maxCars, int nrdoors, Color color, double enginepower, double trimfactor, boolean carturbo){
        this.maxCars = maxCars;
        this.caross = new Caross(nrdoors,color);
        this.engine = new Engine(enginepower, trimfactor, carturbo);

    }

    Deque<Car> cars = new LinkedList<>();

    @Override
    public void onLoadingCar(Car car) {
        while (cars.size()<maxCars){
        cars.addLast(car);
    }

}
    @Override
    public void offLoadingCar() {
        while (cars.size()>0){
            cars.pop();
        }

    }
}

