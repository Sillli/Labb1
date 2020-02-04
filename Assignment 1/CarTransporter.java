public class CarTransporter extends Scania {

    private boolean rampUp;
    private int maxCarsLoaded = 6;

    public CarTransporter() {
        setModelName("Mercedes");
        rampUp = true;
    }


    @Override
    public double speedFactor() {
        return 0;
    }

    public void setRampUp() {
        rampUp = true;
    }

    public void setRampDown() {
        if (getCurrentSpeed() != 0) {
            //do nothing
        } else {
            rampUp = false;
        }
    }


}
