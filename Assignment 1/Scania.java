public class Scania extends Car {

    private Flatbed flatbed;
    private final static double trimFactor = 1.10;

    /**
     *constructor of the class Scania, sets it unique attributes
     */
    public Scania() {
        setEnginePower(400);
        setModelName("Scania");
        setNrDoors(2);

        this.flatbed = new Flatbed();
    }

    /***
     * A getter method that returns the Flatbed object in the scania object
     * @return Flatbed object
     */
    public Flatbed getFlatbed(){
        return this.flatbed;
    }

    /**
     * method that tips the flatbed, has a few conditions
     * if the scania is moving this can not happen
     * if the scania already has the flatbed up it can't move the flatbed further
     *
     */

    public void tipFlatbed(double degree) {
        if (getCurrentSpeed() != 0) {
            //DO NOTHING
        } else if (getCurrentSpeed() == 0 && flatbed.getFlatbedAngle()<=70 && flatbed.getFlatbedAngle()<= degree){
            flatbed.tipFlatbed(degree);
        }
    }

    /**
     * Method that decides if the flatbed can be lowered
     */
    public void lowerFlatbed(double degree) {
        if (getCurrentSpeed() != 0) {
            //DO NOTHING
        } else if (getCurrentSpeed() == 0 && flatbed.getFlatbedAngle()>=0 && flatbed.getFlatbedAngle()>= degree){
            flatbed.lowerFlatbed(degree);
        }
    }

    /**
     *
     * @return the speedfactor of the scania-truck
     */
    @Override
    public double speedFactor() {
        return getEnginePower()*0.01*trimFactor;
    }

    /**
     * Checks if the flatbed is up, and if it is the scania can not move and a "error message" prints out
     * if tthe flatbed is down the car can move
     */
    @Override
    public void move() {
        if (flatbed.getFlatbedAngle() != 0) {
            setCurrentSpeed(0);
            System.out.println("Flatbed is up");
        } else if (flatbed.getFlatbedAngle() == 0) {
            super.move();
        }
    }


}
