import com.sun.source.util.SourcePositions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;

public class TimerListener implements ActionListener {

    ArrayList<Motorized> vehicle;
    //ArrayList<Motorized> vehicle;

    ChangeDir changeDirection;

    ArrayList<ICarObserver> observers = new ArrayList<>();


    public TimerListener(int height, int width, ArrayList<Motorized> vehicle) {
        this.changeDirection = new ChangeDir(height, width);
        this.vehicle = vehicle;
    }

    public void actionPerformed(ActionEvent e) {
        for (Motorized car : vehicle) {
            car.move();
            int x = (int) Math.round(car.position.getPosX());
            int y = (int) Math.round(car.position.getPosY());
            changeDirection.changeDirection(car, x, y);
            notifyObsPos(car);
            //frame.drawPanel.moveit(car,x, y);
            // repaint() calls the paintComponent method of the panel
            //frame.drawPanel.repaint();
        }

    }

    public void addObserver(ICarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ICarObserver observer) {
        observers.remove(observer);
    }

    public void notifyObsPos(Motorized car) {
        for (ICarObserver observer : observers) {
            observer.update(vehicle.indexOf(car), (int) car.position.getPosX(), (int) car.position.getPosY());
        }
    }

    public void notifyObsNewCar(String modelName) {
        for (ICarObserver observer : observers) {
            observer.newCar(modelName);
        }

    }

    public void notifyObsRemoveCar(int index) {
        for (ICarObserver observer : observers) {
            observer.removeCar(index);
        }
    }
}


