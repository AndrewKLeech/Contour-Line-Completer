import java.util.*;
import javax.swing.JFrame;

public class Voronoi extends JFrame{
    private List<Vector> voronoiPoints = new ArrayList<>();
    private static int height = 500;
    private static int width = 500;
    private Voronoi (){
        super("Contour Connector");
        setBounds(0, 0, width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Voronoi().setVisible(true);
    }
}
