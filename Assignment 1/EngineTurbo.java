public class EngineTurbo extends Engine {

    public CarTurbo carTurbo;


    public EngineTurbo(double enginePower) {
        super(enginePower);
        this.carTurbo = new CarTurbo(false);
    }

    public double speedFactor(){
            double turbo = 1;
            if (carTurbo.isTurboOn()) {
                turbo = 1.3;
            }return getEnginePower() * 0.01 * turbo;
    }




}
