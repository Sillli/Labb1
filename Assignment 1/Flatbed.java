
public class Flatbed {

private double flatbedAngle;

    /***
     * A constructor of a Flatbed object
     */
    public Flatbed(){
        setFlatbedAngle(0);
}
    /**
     * setting the angle of the flatbed, either to  0 or 70
     * @param flatbedAngle the angle the flatbed is gonna get
     */
    public void setFlatbedAngle(double flatbedAngle) {
        this.flatbedAngle = flatbedAngle;
    }

    /**
     * getting the angle of the flatbed, 0 or 70
     * @return flatbedAngle, shows if the angle is up or down
     */
    public double getFlatbedAngle(){ return flatbedAngle; }

    /***
     * A method that lowers the flatbedAngle
     * @param degree a parameter of type double
     */
    public void lowerFlatbed(double degree) {
        if(degree >= 0 && degree <= 70) {
            setFlatbedAngle(degree);
        }
    }

    /***
     * A method that raise tha flatbeds angle
     * @param degree a parameter of type double
     * */
    public void tipFlatbed(double degree){
        if (degree >= 0 && degree <= 70){
            setFlatbedAngle(degree);
        }
    }
}
