import com.sun.source.doctree.StartElementTree;

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
        if(getCurrentSpeed() != 0){
            //DO NOTHING
        }else if(getCurrentSpeed() == 0 && getFlatbedAngle()!=70){
            setFlatbedAngle(70);
            }
        }

    public void lowerFlatbed(){
        if(getCurrentSpeed()!=0){
            //DO NOTHING
        }else if (getCurrentSpeed()== 0 && getFlatbedAngle()>=0){
            setFlatbedAngle(0);
        }


    }


    public double getFlatbedAngle() {
        return flatbedAngle;
    }

    public void setFlatbedAngle(double flatbedAngle) {
        this.flatbedAngle = flatbedAngle;
    }
}
