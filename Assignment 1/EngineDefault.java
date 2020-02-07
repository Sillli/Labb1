public class EngineDefault extends Engine{

    private final static double engineDefaultTrim = 1.0;

    public EngineDefault(double enginePower) {
        super(enginePower);
    }
    public double speedFactor(){
            return this.getEnginePower() * 0.01 * getEngineDefaultTrim();
        }

    private double getEngineDefaultTrim() {
        return engineDefaultTrim;
    }




}
