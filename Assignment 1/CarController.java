import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController {
    // member fields:
    // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.
     //protected Timer timer = new Timer(delay, new TimerListener());
    protected Timer timer;

    Container container;

    public CarController(){


    }

    public void initModel(Container container){
        this.container = container;
        this.timer  = new Timer(delay, container.getTimerListener());
    }
    //methods:



    // Calls the gas method for each car once
    void gas(int amount) {
        container.gas(amount);

    }

    void turnLeft() {
        container.turnLeft();

    }

    void turnRight() {
        container.turnRight();

    }

    void brake(int amount) {
        container.brake(amount);

    }
    void turnTurboOn() {
        container.turnTurboOn();

    }

    void turnTurboOff() {
        container.turnTurboOff();

    }

    void turnEngineOn() {
        container.turnEngineOn();

    }

    void turnEngineOff() {
        container.turnEngineOff();

    }

    void liftTheFlatbed() {
        container.liftTheFlatbed();


    }

    void lowerTheFlatbed() {
        container.lowerTheFlatbed();



    }

    void addCar(){
        container.addCars();
    }
}

