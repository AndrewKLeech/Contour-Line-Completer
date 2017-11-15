import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.swing.JFrame;

public class Voronoi extends JFrame{
    private List<Vector> voronoiPoints = new ArrayList<>();
    private static int height = 500;
    private static int width = 500;
    static BufferedImage img;
    //set number of test points
    static int numberOfPoints = 50;
    private Voronoi (){
        super("Contour Connector");
        setBounds(0, 0, width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Random rand = new Random();

        img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = img.createGraphics();
        g.setPaint ( new Color ( 255, 255, 255 ) );
        g.fillRect ( 0, 0, width, height);
        g.setColor(Color.BLACK);
    }

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, this);
    }
    public static void main(String[] args){
        new Voronoi().setVisible(true);
    }
}
