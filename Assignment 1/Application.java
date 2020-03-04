public class Application {
    public static void main(String[] args) {
        // Instance of this class

        CarController cc = new CarController();
        CarView carView = new CarView("CarSim 1.0", cc);

        Container container= new Container(carView.getHeight(), carView.getWidth(),carView);
        cc.initModel(container);

        container.addCarObserver(carView);
// hej

        /*Motorized volvo = MotorizedFactory.createVolvo240();

        Motorized saab = MotorizedFactory.createSaab95();
        saab.position.setPosY(100);

        Motorized scania = MotorizedFactory.createScania();
        scania.position.setPosY(200);
        container.vehicle.add(volvo);
        container.vehicle.add(saab);
        container.vehicle.add(scania);

         */
        // Start a new view and send a reference of self
//        cc.frame = carView; //new CarView("CarSim 1.0", cc);

        // Start the timer
        cc.timer.start();
    }
}
