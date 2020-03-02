import java.util.ArrayList;

public class ChangeDir{

    protected int maxWidth;
    protected int maxHeight;

    public ChangeDir(int maxHeight, int maxWidth){
        this.maxHeight=maxHeight;
        this.maxWidth=maxWidth;
    }

    protected void changeDirection(Motorized vehicle, int x, int y) {
        changeYDirection(vehicle, y);
        changeXDirection(vehicle, x);
    }

    private void changeYDirection(Motorized vehicle, int y) {
        if (y > maxHeight- 300) {
            vehicle.stopEngine();
            vehicle.setDirY(-1);
            vehicle.startEngine();
        } else if (y < 0) {
            vehicle.stopEngine();
            vehicle.setDirY(1);
            vehicle.startEngine();
        }
    }

    private void changeXDirection(Motorized vehicle, int x) {
        if (x > maxWidth - 100) {
            vehicle.stopEngine();
            vehicle.setDirX(-1);
            vehicle.startEngine();
        } else if (x < 0) {
            vehicle.stopEngine();
            vehicle.setDirX(1);
            vehicle.startEngine();
        }
    }


    void update(){
    }





}
