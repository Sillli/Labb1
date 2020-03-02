public class EngineTurbo extends Engine {

    protected CarTurbo carTurbo;


    public EngineTurbo(double enginePower) {
        super(enginePower);
        this.carTurbo = new CarTurbo();
    }

    public double speedFactor(){
        return getEnginePower() * 0.01 * carTurbo.getState().TurboFactor(carTurbo);
    }




}
