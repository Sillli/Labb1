public class CarTransporter extends Car {

    private Flatbed flatbed;
    private final static double trimFactor=1.10;
    private final int maxCarsLoaded = 6;

    public CarTransporter(Flatbed flatbed) {
        setEnginePower(400);
        setModelName("Mercedes");
        setNrDoors(2);
        this.flatbed = flatbed;
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
}
