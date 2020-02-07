public class CarTurbo {

    /**
     * A class that can be used by any class that needs a turbo.
     */
    public boolean TurboOn;

    public CarTurbo(boolean turboOn) {
        TurboOn = turboOn;
    }

    public boolean isTurboOn() {
        return TurboOn;
    }

    public void setTurboOn(boolean turboOn) {
        TurboOn = turboOn;
    }


}
