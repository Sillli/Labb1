import javax.swing.*;
import java.awt.*;
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
    private Dimension dimension;
    // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.
    private Timer timer = new Timer(delay, new TimerListener());

    // The frame that represents this instance View of the MVC pattern
    CarView frame;
    // A list of cars, modify if needed
    ArrayList<Motorized> cars = new ArrayList<>();

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
            for (Motorized car : cars) {
                if (hitWall(car.position, dimension)) {
                    invertDirection(car.position);
                } else {
                    car.move();
                    int x = (int) Math.round(car.position.getPosX());
                    int y = (int) Math.round(car.position.getPosY());
                    frame.drawPanel.moveit(x, y);
                    // repaint() calls the paintComponent method of the panel
                    frame.drawPanel.repaint();
                }
            }
        }
    }

    // Calls the gas method for each car once
    void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Motorized car : cars) {
            car.gas(gas);
        }
    }

    void brake(int amount) {
        double brake = ((double) amount) / 100;
        for (Motorized car : cars) {
            car.brake(brake);
        }
    }


    boolean hitWall(Position car, Dimension wall) {
        //invertDirection(car);
        return car.getPosY() - 1 == wall.getHeight();
    }

    void invertDirection(Position direction) {
        //   Position direction = new Position(0, 0, 0, -1);
        if (direction.getDirY() == -1) {
            direction.setDirY(1);
        } else if (direction.getDirY() == 1) {
            direction.setDirY(-1);
        }
    }
}
