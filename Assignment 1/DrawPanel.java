import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

// This panel represent the animated part of the view with the car images.

public class DrawPanel<CarPicPoint> extends JPanel{


    private ArrayList<BufferedImage> images = new ArrayList<>();
    //Just a single image, TODO: Generalize
    BufferedImage saabImage;
    BufferedImage scaniaImage;
    BufferedImage volvoImage;


    // To keep track of a singel cars position;




    Point volvoPoint = new Point();
    Point saabPoint = new Point();
    Point scaniaPoint = new Point();


    // TODO: Make this general for all cars
    void moveit(Car car, int x, int y){
        if(car.modelName.equals("Volvo240")) {
            volvoPoint.x = x;
            volvoPoint.y = y;
        }else if(car.modelName.equals("Saab95")) {
            saabPoint.x = x;
            saabPoint.y = y;
        }else if(car.modelName.equals("Scania")) {
            scaniaPoint.x = x;
            scaniaPoint.y = y;
        }

    }

    // Initializes the panel and reads the images
    public DrawPanel(int x, int y) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.green);
        // Print an error message in case file is not found with a try/catch block
        try {
            // You can remove the "pics" part if running outside of IntelliJ and
            // everything is in the same main folder.
            // volvoImage = ImageIO.read(new File("Volvo240.jpg"));

            // Remember to rightclick src New -> Package -> name: pics -> MOVE *.jpg to pics.
            // if you are starting in IntelliJ.
            volvoImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Volvo240.jpg"));
            saabImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Saab95.jpg"));
           // scaniaImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pic/Scania.jpg"));
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }

    }



    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(volvoImage, volvoPoint.x, volvoPoint.y, null); // see javadoc for more info on the parameters
        g.drawImage(saabImage,saabPoint.x,saabPoint.y,null);
        g.drawImage(scaniaImage,scaniaPoint.x,scaniaPoint.y,null);
    }
}
