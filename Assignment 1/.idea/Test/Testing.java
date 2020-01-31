
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertTrue;

public class Testing {

    private Volvo240 volvo;
    private Saab95 saab;


    @Before
    public void init() {
        volvo = new Volvo240();
        saab = new Saab95();


    }

    @Test
    public void testSpeedFactor() {
        assertTrue(volvo.speedFactor() == 1.25);
    }

    @Test
    public void testincrementSpeedVolvo() {
        volvo.setCurrentSpeed(10);
        volvo.incrementSpeed(10);

        System.out.println(volvo.getCurrentSpeed());
        assertTrue(volvo.getCurrentSpeed() == 22.5);
    }

    @Test
    public void testDecrementSpeedVolvo() {
        volvo.setCurrentSpeed(10);
        volvo.decrementSpeed(10);
        System.out.println(volvo.getCurrentSpeed());
        assertTrue(volvo.getCurrentSpeed() == (0));
    }

    @Test
    public void testStartEngineCar() {
        volvo.startEngine();
        System.out.println(volvo.getCurrentSpeed());
        assertTrue(volvo.getCurrentSpeed() > 0);
    }

    @Test
    public void testStopEngineCar() {
        volvo.startEngine();
        volvo.stopEngine();
        System.out.println(volvo.getCurrentSpeed());
        assertTrue(volvo.getCurrentSpeed() == 0);
    }

    @Test
    public void testGasCarVolvo() {
        volvo.gas(10);
        System.out.println(volvo.getCurrentSpeed());
        assertTrue(volvo.getCurrentSpeed() == 12.5);
    }

    @Test
    public void testBrakeCarVolvo() {
        volvo.setCurrentSpeed(10);
        volvo.brake(10);
        System.out.println(volvo.getCurrentSpeed());
        assertTrue(volvo.getCurrentSpeed() == 0);

    }


    @Test
    public void testingSpeedFactorSaab() {
        saab.setTurboOn();
        assertTrue(saab.speedFactor() == saab.getEnginePower() * 0.013);

    }


    @Test
    public void testTurnLeftCarVolvo() {
        volvo.setDirX(0);
        volvo.setDirY(1);

        volvo.turnLeft();

        System.out.println(volvo.getDirX());
        System.out.println(volvo.getDirY());
        assertTrue(volvo.getDirX() == -1 && volvo.getDirY() == 0);
    }

    @Test
    public void testTurnRightCarVolvo() {
        volvo.setDirX(0);
        volvo.setDirY(1);
        volvo.turnRight();
        assertTrue(volvo.getDirX() == 1 && volvo.getDirY() == 0);
    }

    @Test
    public void testIncrementSpeedSaab() {
        saab.setTurboOn();
        saab.setCurrentSpeed(10);
        saab.incrementSpeed(10);
        //System.out.println(saab.getCurrentSpeed());
        assertTrue(saab.getCurrentSpeed() == 26.25);

    }

    @Test
    public void testGetModelNameOfCar() {
        assertTrue(saab.getModelName() == "Saab95");
    }

    @Test
    public void testGetColorOfCar() {
        assertTrue(saab.getColor() == Color.red);
    }


    @Test
    public void testGetNrDoorsCarVolvoSaab() {
        System.out.println(volvo.getNrDoors());
        System.out.println(saab.getNrDoors());
        assertTrue(volvo.getNrDoors() == 4 && saab.getNrDoors() == 2);
    }

    @Test
    public void testMoveVolvo(){
        volvo.setCurrentSpeed(10);
        volvo.setPosX(0);
        volvo.setPosY(0);
        volvo.move();
        System.out.println(volvo.getPosX());
        System.out.println(volvo.getPosY());
        assertTrue(volvo.getPosX() != 0 || volvo.getPosY()!=0);
    }



}
