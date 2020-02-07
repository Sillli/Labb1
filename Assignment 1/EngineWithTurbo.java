public class EngineWithTurbo  extends Engine{

    private CarTurbo carturbo;


    public EngineWithTurbo(double enginePower) {
        super(enginePower);
        this.carturbo= new CarTurbo(false);
    }
    @Override
    public double speedFactor(){
            double turbo = 1;
            if (this.carturbo.isTurboOn()) turbo = 1.3;
            return getEnginePower() * 0.01 * turbo;
        }
    }

