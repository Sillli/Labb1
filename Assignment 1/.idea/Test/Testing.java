/*
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
        public void testIncrementSpeedSaab(){
            saab.setTurboOn();
            saab.setCurrentSpeed(10);
            saab.incrementSpeed(10);
            //System.out.println(saab.getCurrentSpeed());
            assertTrue(saab.getCurrentSpeed() == 26.25);

        }
        @Test
        public void testSetTurboOff(){
        saab.setTurboOff();
        saab.setCurrentSpeed(10);
        saab.incrementSpeed(10);
            System.out.println(saab.getCurrentSpeed());
         assertTrue(saab.getCurrentSpeed()==22.5);
        }

        @Test
        public void testGetModelNameOfCar () {
            assertTrue(saab.getModelName() == "Saab95");
        }

        @Test
        public void testGetColorOfCar () {
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
    @Test
    public void testSetFlatbed(){
        Flatbed flatbed = new Flatbed();
        flatbed.setFlatbedAngle(10);
        System.out.println(flatbed.getFlatbedAngle());
        assertTrue(flatbed.getFlatbedAngle()==10);
    }




    @Test
    public void testTipFlatbedScania(){
        Scania scania = new Scania();
        scania.setCurrentSpeed(10);
        scania.tipFlatbed(70);
        assertTrue(scania.getFlatbedAngle()==0);
    }
    @Test
    public void testLowerFlatbedScania(){
        Scania scania = new Scania();
        scania.setFlatbedAngle(70);
        System.out.println(scania.getFlatbedAngle());
        scania.lowerFlatbed(0);
        assertTrue(scania.getFlatbedAngle()==0);
    }


    @Test
    public void testMoveScaniaFlatbedUp(){
        Scania scania = new Scania();
        scania.setFlatbedAngle(0);
        scania.tipFlatbed(70);
        scania.setCurrentSpeed(10);
        scania.setPosX(0);
        scania.setPosY(0);
        scania.move();
        assertTrue( scania.getPosY()==0);
    }

    @Test
    public void testMoveScaniaFlatbedDown(){
        Scania scania = new Scania();
        scania.setFlatbedAngle(70);
        scania.lowerFlatbed(0);
        scania.setDirY(1);
        scania.setCurrentSpeed(10);
        scania.setPosY(0);
        scania.setPosX(0);
        scania.move();
        System.out.println(scania.getPosX());
        System.out.println(scania.getPosY());
        assertTrue( scania.getPosY()!=0);
    }


    @Test
    public void testSpeedFactorScania(){
        Scania scania = new Scania();
        System.out.println(scania.speedFactor());
        assertTrue(scania.speedFactor()==4.4);
    }
    @Test
    public void testSpeedFactorCarTransporter(){
        CarTransporter carTransporter = new CarTransporter();
        assertTrue(carTransporter.speedFactor()==4.4);
    }
    @Test
    public void testTipFlatbedCarTransporter(){
        CarTransporter carTransporter = new CarTransporter();
        carTransporter.tipFlatbed();
        assertTrue(carTransporter.flatbed.getFlatbedAngle()==70);
    }
    @Test
    public void testLowerFlatbedCarTransporter(){
        CarTransporter carTransporter= new CarTransporter();
        carTransporter.flatbed.setFlatbedAngle(70);
        carTransporter.lowerFlatbed();
        assertTrue(carTransporter.flatbed.getFlatbedAngle()==0);
    }
    @Test
    public void testOnLoadingCarTransporter(){
        CarTransporter carTransporter = new CarTransporter();
        carTransporter.setPosX(0);
        carTransporter.setPosY(0);
        carTransporter.flatbed.setFlatbedAngle(70);
        Volvo240 volvo = new Volvo240();
        volvo.setPosX(1);
        volvo.setPosY(1);
        carTransporter.onLoadingCar(volvo);
        assertTrue(carTransporter.stack.size()==1);
    }
    @Test
    public void testOffLoadingCarTransporter(){
        CarTransporter carTransporter = new CarTransporter();
        carTransporter.setPosX(0);
        carTransporter.setPosX(0);
        volvo.setPosY(1);
        volvo.setPosX(1);
        carTransporter.flatbed.setFlatbedAngle(70);
        Volvo240 volvo = new Volvo240();
        carTransporter.onLoadingCar(volvo);
        System.out.println(carTransporter.stack.size());
        carTransporter.offLoadingCar();
        assertTrue(carTransporter.stack.size()==0);
    }

    @Test
    public void testTransported(){

    }
    @Test
    public void testDistanceX(){
        volvo.setPosX(4);
        Volvo240 volvo2 = new Volvo240();
        volvo2.setPosX(-4);
        assertTrue(volvo.getDistanceX(volvo2)==8);
    }
    @Test
    public void testDistanceY(){
        Volvo240 volvo2 = new Volvo240();
        volvo.setPosY(6);
        volvo2.setPosY(10);
        assertTrue(volvo2.getDistanceY(volvo)==4);
    }


}
*/