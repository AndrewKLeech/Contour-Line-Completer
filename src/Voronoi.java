import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.swing.JFrame;

public class Voronoi extends JFrame{
    private List<VPoint> vPoints = new ArrayList<>();
    private static int height = 500;
    private static int width = 500;
    static BufferedImage img;
    static int numberOfPoints = 50;
    final int[] randX = new Random().ints(0, width).distinct().limit(numberOfPoints).toArray();
    final int[] randY = new Random().ints(0, height).distinct().limit(numberOfPoints).toArray();
    //set number of test points

    private Voronoi (){
        super("Contour Connector");
        setBounds(0, 0, width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Random rand = new Random();
        for(int i = 0; i<numberOfPoints; i++){
            VPoint vPoint = new VPoint(randX[i],randY[i]);
            vPoints.add(vPoint);
            System.out.println("Point " + i + "\nX: " + vPoints.get(i).getX() + "\nY: " + vPoints.get(i).getY());
        }

        //sort points by Y coordinate

        img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = img.createGraphics();
        g.setPaint ( new Color ( 255, 255, 255 ) );
        g.fillRect ( 0, 0, width, height);
        g.setColor(Color.BLACK);

        for (int i = 0; i < numberOfPoints; i++) {
            g.fill(new Ellipse2D .Double(Math.abs(vPoints.get(i).getX() - 2.5), Math.abs(vPoints.get(i).getY() - 2.5), 5, 5));
        }

        Collections.sort(vPoints);
        int nextPoint = 0;

        VLine sweepLn = new VLine(0,height,width,height);
        for(int i = 0; i<height; i++){
            sweepLn.setStartCoord(0,i);
            sweepLn.setEndCoord(width,i);
            System.out.println(i);
            System.out.println("Before hit nextpoint: " + nextPoint);
            if(i == vPoints.get(nextPoint).getY()){
                System.out.println("hit: " + i);
                System.out.println("After hit nextpoint: " + nextPoint);
                g.drawLine(sweepLn.getStart().getX(), i, sweepLn.getEnd().getX(), i);
                if(nextPoint<numberOfPoints-1){
                    nextPoint++;
                }

            }
        }
    }

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, this);
    }
    public static void main(String[] args){
        new Voronoi().setVisible(true);
    }
}
