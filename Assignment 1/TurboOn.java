public class TurboOn implements TurboState {


    public TurboOn() {
    }

    @Override
    public double TurboFactor(CarTurbo carTurbo) {
        double turbo = 1.3;
        return turbo;
    }
}
