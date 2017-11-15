public class VPoint implements Comparable<VPoint>{
    private int x;
    private int y;
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
    public int compareTo(VPoint point) {

        int compareY = ((VPoint) point).getY();

        return this.y - compareY;
    }
}
