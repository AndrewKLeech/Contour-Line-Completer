public class VPoint implements Comparable<VPoint>{
    private int x;
    private int y;
    private Parabola parabola;
    public VPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public Parabola getParabola(){
        return parabola;
    }
    public void setParabola(Parabola newParabola){
        parabola = newParabola;
    }
    public void initParabola(){
        parabola = new Parabola(this);
    }
    public int compareTo(VPoint point) {

        int compareY = ((VPoint) point).getY();

        return this.y - compareY;
    }
    public VPoint getLeftVPoint() {
        return parabola.getLeftVPoint();
    }

    public void setLeftVPoint(VPoint leftVPoint) {
        this.parabola.setLeftVPoint(leftVPoint);
    }

    public VPoint getRightVPoint() {
        return parabola.getRightVPoint();
    }

    public void setRightVPoint(VPoint rightVPoint) {
        this.parabola.setRightVPoint(rightVPoint);
    }
}
