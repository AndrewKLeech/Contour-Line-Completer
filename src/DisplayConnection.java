/*Most code in this file is just initial code for testing. In the end the program will take
*an input and find the points its self.
* */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.JFrame;

public class DisplayConnection extends JFrame {
    static BufferedImage img;
    static int posX[], posY[];
    static int windowSize = 500;
    static int numberOfPoints = 5;
    public DisplayConnection() {
        super("Contour Connector");
        setBounds(0, 0, windowSize, windowSize);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Random rand = new Random();

        img = new BufferedImage(windowSize, windowSize, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = img.createGraphics();
        g.setPaint ( new Color ( 255, 255, 255 ) );
        g.fillRect ( 0, 0, windowSize, windowSize);
        g.setColor(Color.BLACK);

        posX = new int[numberOfPoints];
        posY = new int[numberOfPoints];
        for (int i = 0; i < numberOfPoints; i++) {
            posX[i] = rand.nextInt(windowSize);
            posY[i] = rand.nextInt(windowSize);
        }
        for (int i = 0; i < numberOfPoints; i++) {
            g.fill(new Ellipse2D .Double(Math.abs(posX[i] - 2.5), Math.abs(posY[i] - 2.5), 5, 5));
        }
    }

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, this);
    }

    public static void main(String[] args) {
        new DisplayConnection().setVisible(true);
    }
}
