public class Parabola {
    public VPoint vPoint;
    public VEvent event;
    public Parabola parent, left, right;
    public boolean isLeaf;
    public VLine line;

    Parabola() {
        this.vPoint = null;
        isLeaf = (vPoint != null);
    }

    Parabola(VPoint vPoint) {
        this.vPoint = vPoint;
        isLeaf = (vPoint != null);
    }
    public void setLeft(Parabola parabola)
    {
        left = parabola;
        parabola.parent = this;
    }
    public void setRight(Parabola parabola)
    {
        right = parabola;
        parabola.parent = this;
    }
}