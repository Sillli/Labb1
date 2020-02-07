import java.util.LinkedList;
import java.util.List;

/**
 * A class for workshop for cars only
 * @param <T>
 */

public class Workshop < T extends Car>  {

    List<T> carList = new LinkedList<>();

    private final int maxCars;


    /**
     *
     * @param maxCars max amount off cars the shop can take in
     */
    public Workshop(int maxCars){
        this.maxCars = maxCars;
    }


    /**
     * class
     * @param car
     */
    public void onLoadingCar (T car) {
        if(carList.size()<maxCars){
            carList.add(car);
        }
    }

    public T offLoadingCar(T car) {
        T c = carList.get(carList.indexOf(car));
        carList.remove(car);
        return c;
    }



}

/*
        List<Saab95> saab95List = new LinkedList<>();
        saab95List.add(new Volvo240());

        Workshop<Saab95> saab95Workshop = new Workshop<>(3);
        saab95Workshop.onLoadingCar(new Volvo240());
        saab95Workshop.offLoadingCar(new Volvo240());


 */
