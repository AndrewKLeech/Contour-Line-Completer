import javax.swing.JFrame;

public class DisplayConnection extends JFrame {

    public DisplayConnection() {
        super("Contour Connector");
        setBounds(0, 0, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new DisplayConnection().setVisible(true);
    }
}