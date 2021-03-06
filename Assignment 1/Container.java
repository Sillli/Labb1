import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class Container {

    ArrayList<Motorized> vehicle = new ArrayList<>();


    protected int maxWidth;
    protected int maxHeight;

    private TimerListener timerListener;


    public Container(int maxHeight, int maxWidth, CarView frame) {
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
        timerListener = new TimerListener(maxWidth, maxHeight, vehicle);
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

    void addCarObserver(ICarObserver observer) {
        timerListener.addObserver(observer);
    }

    void addCars() {

        Random rand = new Random();

        if (vehicle.size() < 100) {
            switch (rand.nextInt(4) + 1) {
                case 1:
                    Motorized m = MotorizedFactory.createScania();
                //    Point p = new Point((int) m.position.getPosY(), (int) m.position.getPosX());
                    vehicle.add(m);
                    timerListener.notifyObsNewCar(m.modelName);
                    //frame.drawPanel.addVehicles(frame.drawPanel.scaniaImage, p);
                    break;
                case 2:
                    Motorized s = MotorizedFactory.createSaab95();
                 //   Point sp = new Point((int) s.position.getPosY(), (int) s.position.getPosX());
                    vehicle.add(s);
                    timerListener.notifyObsNewCar(s.modelName);

                    //frame.drawPanel.addVehicles(frame.drawPanel.saabImage, sp);
                    break;
                case 3:
                    Motorized v = MotorizedFactory.createVolvo240();
                   // Point vp = new Point((int) v.position.getPosY(), (int) v.position.getPosX());
                    vehicle.add(v);
                    timerListener.notifyObsNewCar(v.modelName);

                    //frame.drawPanel.addVehicles(frame.drawPanel.volvoImage, vp);
                    break;

            }

        }

    }

    void removeCars() {
        int index = vehicle.size() - 1;
        //frame.drawPanel.repaint();
        if (index >= 0) {
          //  frame.drawPanel.removeVehicles(index);
            timerListener.notifyObsRemoveCar(index);

            vehicle.remove(index);
        }



    }

}
