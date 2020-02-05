
public class Flatbed {

private double flatbedAngle;

    /***
     * A constructor of a Flatbed object
     */
    public Flatbed(){
        setFlatbedAngle(0);
}
    /**
     * setting the angle of the flatbed
     * @param flatbedAngle the angle the flatbed is gonna get
     */

    public void setFlatbedAngle(double flatbedAngle) {

        this.flatbedAngle = flatbedAngle;
    }

    /**
     * getting the angle of the flatbed
     * @return flatbedAngle, shows if the angle is up or down
     */
    public double getFlatbedAngle(){
        return flatbedAngle; }

   /*
    public void lowerFlatbed(double degree) {
        if(degree >= 0 && degree <= 70) {
            setFlatbedAngle(degree);
        }
    }

    /*
    public void tipFlatbed(double degree){
        if (degree >= 0 && degree <= 70){
            setFlatbedAngle(degree);
        }
    }*/
}
