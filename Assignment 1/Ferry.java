import java.util.Deque;
import java.util.LinkedList;

public class Ferry implements IStoreCars {

    private final int maxCars;

    public Ferry (int maxCars){
        this.maxCars = maxCars;
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
        while (cars.size()<0){
            cars.pop();
        }

    }
}

