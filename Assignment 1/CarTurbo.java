import java.util.Optional;

public class CarTurbo {

    /**
     * A class that can be used by any class that needs a turbo.
     */


    protected TurboState CurrentState;
    protected TurboState TurboOn = new TurboOn();
    protected TurboState TurboOff = new TurboOff();

    public CarTurbo() {
        CurrentState = TurboOff;
    }

    protected void setState(TurboState state) {
        this.CurrentState = state;
    }
    public void setTurboOn(){
        setState(TurboOn);
    }
    public void setTurboOff(){
        setState(TurboOff);
    }
    public TurboState getState(){
        return CurrentState;
    }

}
