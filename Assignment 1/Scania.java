import java.util.Scanner;

public abstract class Scania extends Car {

    private double flatbedAngle;


    public Scania(double flatbedAngle) {
        setEnginePower(400);
        setModelName("Scania");
        setNrDoors(2);
        this.flatbedAngle = flatbedAngle;
    }

    public double getFlatbedAngle() {
        return flatbedAngle;
    }

    public void setFlatbedAngle(double flatbedAngle) {
        this.flatbedAngle = flatbedAngle;
    }
    @Override
    public void move(){
        if (getFlatbedAngle() != 0){
            setCurrentSpeed(0);
            System.out.println("Flatbed is up");
        }
        else if (getFlatbedAngle()== 0 ){
           super.move();
        }
    }



}
