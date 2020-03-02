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

    // The frame that represents this instance View of the MVC pattern
    Container container;
    // A list of cars, modify if needed
    //ArrayList<Motorized> vehicle = new ArrayList<>();

    public CarController(){
        //Container container //param
       // this.timer  = new Timer(delay, container.getTimerListener());
    }

    public void initModel(Container container){
        this.container = container;
        this.timer  = new Timer(delay, container.getTimerListener());
    }
    //methods:


    /* Each step the TimerListener moves all the cars in the list and tells the
    * view to update its images. Change this method to your needs.
    * */
   /* private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Motorized car : vehicle) {
                car.move();
                int x = (int) Math.round(car.position.getPosX());
                int y = (int) Math.round(car.position.getPosY());
                changeDirection(car,x,y);
                frame.drawPanel.moveit(car,x, y);
                // repaint() calls the paintComponent method of the panel
                frame.drawPanel.repaint();
            }


        }
    }
*/


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
}

