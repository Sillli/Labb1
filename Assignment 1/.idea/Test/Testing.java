
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
        volvo.gas(1);
        System.out.println(volvo.getCurrentSpeed());
        assertTrue(volvo.getCurrentSpeed() == 1.25);
    }

    @Test
    public void testBrakeCarVolvo() {
        volvo.setCurrentSpeed(1);
        volvo.brake(1);
        System.out.println(volvo.getCurrentSpeed());
        assertTrue(volvo.getCurrentSpeed() == 0);

    }


    @Test
    public void testingSpeedFactorSaab() {
        //saab.setTurboOn();
        assertTrue(saab.speedFactor() == saab.getEnginePower() * 0.013);

    }

    @Test
    public void testTurnLeftCarVolvo() {
        volvo.position.setDirX(0);
        volvo.position.setDirY(1);

        volvo.turnLeft();

        System.out.println(volvo.position.getDirX());
        System.out.println(volvo.position.getDirY());
        assertTrue(volvo.position.getDirX() == -1 && volvo.position.getDirY() == 0);
    }

    @Test
    public void testTurnRightCarVolvo() {
        volvo.position.setDirX(0);
        volvo.position.setDirY(1);
        volvo.turnRight();
        assertTrue(volvo.position.getDirX() == 1 && volvo.position.getDirY() == 0);
    }

    @Test
    public void testIncrementSpeedSaab() {
        //saab.setTurboOn();
        saab.setCurrentSpeed(10);
        saab.incrementSpeed(10);
        //System.out.println(saab.getCurrentSpeed());
        assertTrue(saab.getCurrentSpeed() == 26.25);

    }

    @Test
    public void testSetTurboOff() {
     //   saab.setTurboOff();
        saab.setCurrentSpeed(10);
        saab.incrementSpeed(10);
        System.out.println(saab.getCurrentSpeed());
        assertTrue(saab.getCurrentSpeed() == 22.5);
    }

    @Test
    public void testGetModelNameOfCar() {
        assertTrue(saab.getModelName() == "Saab95");
    }

    @Test
    public void testGetColorOfCar() {
        assertTrue(saab.chassi.getColor() == Color.red);
    }


    @Test
    public void testGetNrDoorsCarVolvoSaab() {
        System.out.println(volvo.chassi.getNrDoors());
        System.out.println(saab.chassi.getNrDoors());
        assertTrue(volvo.chassi.getNrDoors() == 4 && saab.chassi.getNrDoors() == 2);
    }

    @Test
    public void testMoveVolvo() {
        volvo.setCurrentSpeed(10);
        volvo.position.setPosX(0);
        volvo.position.setPosY(0);
        volvo.move();
        System.out.println(volvo.position.getPosX());
        System.out.println(volvo.position.getPosY());
        assertTrue(volvo.position.getPosX() != 0 || volvo.position.getPosY() != 0);
    }

    @Test
    public void testSetFlatbed() {
        Flatbed flatbed = new Flatbed();
        flatbed.setFlatbedAngle(10);
        System.out.println(flatbed.getFlatbedAngle());
        assertTrue(flatbed.getFlatbedAngle() == 10);
    }


    @Test
    public void testTipFlatbedScania() {
        Scania scania = new Scania();
        scania.setCurrentSpeed(10);
        scania.tipFlatbed();
        assertTrue(scania.getFlatbedAngle() == 0);
    }

    @Test
    public void testLowerFlatbedScania() {
        Scania scania = new Scania();
        scania.setFlatbedAngle(70);
        System.out.println(scania.getFlatbedAngle());
        scania.lowerFlatbed();
        assertTrue(scania.getFlatbedAngle() == 0);
    }


    @Test
    public void testMoveScaniaFlatbedUp() {
        Scania scania = new Scania();
        scania.setFlatbedAngle(0);
        scania.tipFlatbed();
        scania.setCurrentSpeed(10);
        scania.position.setPosX(0);
        scania.position.setPosY(0);
        scania.move();
        assertTrue(scania.position.getPosY() == 0);
    }

    @Test
    public void testMoveScaniaFlatbedDown() {
        Scania scania = new Scania();
        scania.setFlatbedAngle(70);
        scania.lowerFlatbed();
        scania.position.setDirY(1);
        scania.setCurrentSpeed(10);
        scania.position.setPosY(0);
        scania.position.setPosX(0);
        scania.move();
        System.out.println(scania.position.getPosX());
        System.out.println(scania.position.getPosY());
        assertTrue(scania.position.getPosY() != 0);
    }


    @Test
    public void testSpeedFactorScania() {
        Scania scania = new Scania();
        System.out.println(scania.speedFactor());
        assertTrue(scania.speedFactor() == 4.4);
    }

    @Test
    public void testSpeedFactorCarTransporter() {
        CarTransporter carTransporter = new CarTransporter();
        assertTrue(carTransporter.speedFactor() == 4.4);
    }

    @Test
    public void testTipFlatbedCarTransporter() {
        CarTransporter carTransporter = new CarTransporter();
        carTransporter.tipFlatbed();
        assertTrue(carTransporter.flatbed.getFlatbedAngle() == 70);
    }

    @Test
    public void testLowerFlatbedCarTransporter() {
        CarTransporter carTransporter = new CarTransporter();
        carTransporter.flatbed.setFlatbedAngle(70);
        carTransporter.lowerFlatbed();
        assertTrue(carTransporter.flatbed.getFlatbedAngle() == 0);
    }

    @Test
    public void testOnLoadingCarTransporter() {
        CarTransporter carTransporter = new CarTransporter();
        carTransporter.position.setPosX(0);
        carTransporter.position.setPosY(0);
        carTransporter.flatbed.setFlatbedAngle(70);
        Volvo240 volvo = new Volvo240();
        volvo.position.setPosX(1);
        volvo.position.setPosY(1);
        carTransporter.onLoadingCar(volvo);
        assertTrue(carTransporter.stack.size() == 1);
    }

    @Test
    public void testOffLoadingCarTransporter() {
        CarTransporter carTransporter = new CarTransporter();
        carTransporter.position.setPosX(0);
        carTransporter.position.setPosX(0);
        volvo.position.setPosY(1);
        volvo.position.setPosX(1);
        carTransporter.flatbed.setFlatbedAngle(70);
        Volvo240 volvo = new Volvo240();
        carTransporter.onLoadingCar(volvo);
        System.out.println(carTransporter.stack.size());
        carTransporter.offLoadingCar();
        assertTrue(carTransporter.stack.size() == 0);
    }

    @Test
    public void testTransported() {

    }

    @Test
    public void testDistanceX() {
        volvo.position.setPosX(4);
        Volvo240 volvo2 = new Volvo240();
        volvo2.position.setPosX(-4);
        assertTrue(volvo.position.getDistanceX(volvo2.position) == 8);
    }

    @Test
    public void testDistanceY() {
        Volvo240 volvo2 = new Volvo240();
        volvo.position.setPosY(6);
        volvo2.position.setPosY(10);
        assertTrue(volvo2.position.getDistanceY(volvo.position) == 4);
    }


}
