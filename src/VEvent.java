/*Based off http://blog.ivank.net/voronoi-diagram-in-as3.html
  implementation in the action script*/
public class VEvent {
    public VPoint point;
    public boolean pe;

    public float y;
    public double key;

    public Parabola arch;

    public int value;

    public void VEvent(VPoint point, boolean pe){
        this.point = point;
        this.pe = pe;
        this.y = point.getY();
        this.key = Math.random()*1000000000;
    }

    public int compare(VEvent other){
        boolean b1 = (y > other.y);
        return (b1?1:-1);
    }
}
