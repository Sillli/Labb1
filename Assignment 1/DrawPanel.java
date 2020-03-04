import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

// This panel represent the animated part of the view with the car images.

public class DrawPanel extends JPanel {


    protected ArrayList<BufferedImage> images = new ArrayList<>();
    protected ArrayList<Point> points = new ArrayList<>();


    //Just a single image, TODO: Generalize
    BufferedImage saabImage;
    BufferedImage scaniaImage;
    BufferedImage volvoImage;


    void moveit(int index, int x, int y) {
        points.set(index, new Point(x, y));
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
            scaniaImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Scania.jpg"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    void addVehicles(BufferedImage image, Point point) {
        images.add(image);
        points.add(point);
    }

    void removeVehicles(int index) {
        images.remove(index);
        points.remove(index);
    }


    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < images.size(); i++) {
            Point p = points.get(i);
            g.drawImage(images.get(i), p.x, p.y, null);

        }


    }
}
