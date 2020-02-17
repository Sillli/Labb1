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
    private Timer timer = new Timer(delay, new TimerListener());

    // The frame that represents this instance View of the MVC pattern
    CarView frame;
    // A list of cars, modify if needed
    ArrayList<Car> cars = new ArrayList<>();

    //methods:

    public static void main(String[] args) {
        // Instance of this class
        CarController cc = new CarController();

        cc.cars.add(new Volvo240());

        // Start a new view and send a reference of self
        cc.frame = new CarView("CarSim 1.0", cc);

        // Start the timer
        cc.timer.start();
    }

    /* Each step the TimerListener moves all the cars in the list and tells the
     * view to update its images. Change this method to your needs.
     * */
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Car vehicle : cars) {
                vehicle.move();
                int x = (int) Math.round(vehicle.position.getPosX());
                int y = (int) Math.round(vehicle.position.getPosY());
                changeDirection(vehicle, x, y);
                frame.drawPanel.moveit(vehicle, x, y);
                // repaint() calls the paintComponent method of the panel
                frame.drawPanel.repaint();
            }


        }
    }


    private void changeDirection(Motorized vehicle, int x, int y) {
        changeYDirection(vehicle, y);
        changeXDirection(vehicle, x);


    }

    private void changeYDirection(Motorized vehicle, int y) {
        if (y > frame.drawPanel.getHeight() - 80) {
            vehicle.stopEngine();
            vehicle.position.setDirY(-1);
            vehicle.startEngine();
        } else if (y < 0) {
            vehicle.stopEngine();
            vehicle.position.setDirY(1);
            vehicle.startEngine();
        }
    }

    private void changeXDirection(Motorized vehicle, int x) {
        if (x > frame.drawPanel.getWidth() - 100) {
            vehicle.stopEngine();
            vehicle.position.setDirX(-1);
            vehicle.startEngine();
        } else if (x < 0) {
            vehicle.stopEngine();
            vehicle.position.setDirX(1);
            vehicle.startEngine();
        }
    }


    // Calls the gas method for each car once
    void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Motorized car : cars) {
            car.gas(gas);
        }
    }

    void turnLeft() {
        for (Movable vehicle : cars) {
            vehicle.turnLeft();
        }
    }

    void turnRight() {
        for (Movable vehicle : cars) {
            vehicle.turnRight();
        }
    }

    void brake(int amount) {
        double brake = ((double) amount) / 100;
        for (Motorized car : cars) {
            car.brake(brake);
        }
    }

    void turnTurboOn() {
        for (Motorized<EngineTurbo> car : cars) {
            car.engine.carTurbo.setTurboOn(true);
        }
    }

    void turnTurboOff() {
        for (Motorized<EngineTurbo> car : cars) {
            car.engine.carTurbo.setTurboOn(false);
        }
    }
}