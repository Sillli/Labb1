import java.util.Scanner;

public abstract class Scania extends Car {

    private double flatbedAngle;

    public Scania(double flatbedAngle) {
        setEnginePower(400);
        setModelName("Scania");
        setNrDoors(2);
        this.flatbedAngle = flatbedAngle;
    }

    public void tipFlatbed(){

    }

    public void lowerFlatbed(){

    }


}
