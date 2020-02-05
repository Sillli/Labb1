public class CarTransporter extends Car implements ICarTransporter {

    private Flatbed flatbed;
    private final static double trimFactor=1.10;
    private final int maxCarsLoaded = 6;

    public CarTransporter() {
        setEnginePower(400);
        setModelName("Mercedes");
        setNrDoors(2);
        this.flatbed = new Flatbed();
    }

    @Override
    public double speedFactor() {
        return getEnginePower()*0.01*trimFactor;
    }

    public void tipFlatbed(){
        if (getCurrentSpeed()!=0){
            //DO NOTHING
        }else{
            flatbed.setFlatbedAngle(70);
        }
    }

    public void lowerFlatbed(){
        if (getCurrentSpeed()!=0){
            //DO NOTHING
        }else if(getCurrentSpeed()==0 && flatbed.getFlatbedAngle()>0){
            flatbed.setFlatbedAngle(0);
        }
    }

    @Override
    public void loadCar(Car car) {

    }

    @Override
    public void releaseCar() {

    }
}
