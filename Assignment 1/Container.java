import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Container {

    ArrayList<Motorized> vehicle = new ArrayList<>();

    ArrayList<MotorizedFactory> addCar = new ArrayList<>();

    protected int maxWidth;
    protected int maxHeight;
    private TimerListener timerListener;

    public Container(int maxHeight, int maxWidth){
        this.maxHeight=maxHeight;
        this.maxWidth=maxWidth;
        timerListener = new TimerListener(maxWidth,maxHeight, vehicle);
    }

    public ActionListener getTimerListener() {
        return timerListener;
    }


    // Calls the gas method for each car once
    void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Motorized car : vehicle) {
            car.gas(gas);
        }
    }

    void turnLeft() {
        for (Movable vehicle : vehicle) {
            vehicle.turnLeft();
        }
    }

    void turnRight() {
        for (Movable vehicle : vehicle) {
            vehicle.turnRight();
        }
    }

    void brake(int amount) {
        double brake = ((double) amount) / 100;
        for (Motorized car : vehicle) {
            car.brake(brake);
        }
    }
    void turnTurboOn() {
        for (Motorized vehicle : vehicle) {
            if (vehicle instanceof Saab95) {
                ((Saab95) vehicle).setTurboOn();

            }
        }
    }

    void turnTurboOff() {
        for (Motorized vehicle : vehicle) {
            if (vehicle instanceof Saab95) {
                ((Saab95) vehicle).setTurboOff();
            }
        }
    }

    void turnEngineOn() {
        for (Motorized vehicle : vehicle) {
            vehicle.startEngine();
        }
    }

    void turnEngineOff() {
        for (Motorized vehicle : vehicle) {
            vehicle.stopEngine();
        }
    }

    void liftTheFlatbed() {
        for (Motorized vehicle : vehicle) {
            if (vehicle instanceof Scania) {
                ((Scania) vehicle).tipFlatbed();
            }
        }

    }

    void lowerTheFlatbed() {
        for (Motorized vehicle : vehicle) {
            if (vehicle instanceof Scania) {
                ((Scania) vehicle).lowerFlatbed();
            }
        }

    }

    void addCarObserver(ICarObserver observer){
        timerListener.addObserver(observer);
    }



}
