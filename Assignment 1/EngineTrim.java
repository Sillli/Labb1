public class EngineTrim extends Engine {

    protected final double trimFactor;

    public EngineTrim(double enginePower, double trimFactor) {
        super(enginePower);
        this.trimFactor = trimFactor;
    }

    public double getTrimFactor() {
        return trimFactor;
    }

    public double speedFactor(){
        return getEnginePower()*0.01*getTrimFactor();
    }
}
