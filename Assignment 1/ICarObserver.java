public interface ICarObserver {

    void update (int index, int x, int y);

    void newCar(String modelName);

    void removeCar(int index);
}
