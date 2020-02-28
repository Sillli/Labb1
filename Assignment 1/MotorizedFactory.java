public class MotorizedFactory {


public static Motorized createSaab95() {
    return new Saab95();
}
public static Motorized createVolvo240(){
    return new Volvo240();
}
public static Motorized createScania(){
    return new Scania();
}

}
