public class FlatbedDown implements FlatbedState {

    public FlatbedDown() {
    }

    @Override
    public void move(Scania scania) {
        scania.move();


    }

    @Override
    public void startEngine(Scania scania) {
        scania.startEngine();

    }
}
