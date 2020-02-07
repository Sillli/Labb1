public class EngineTrim extends Engine {

    private double trimFactor;

    public EngineTrim(double enginePower, double trimFactor) {
        super(enginePower);
        this.trimFactor = trimFactor;
    }

    public double getTrimFactor() {
        return trimFactor;
    }
    @Override
    public double speedFactor(){
            return this.getEnginePower() * 0.01 * this.getTrimFactor();
        }
    }

