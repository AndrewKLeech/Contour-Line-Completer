public class Parabola {
    private VPoint vPoint, leftVPoint, rightVPoint, paraLeft, paraRight;
    public Parabola(VPoint vPoint) {
        this.vPoint = vPoint;
        this.leftVPoint = leftVPoint;
        this.rightVPoint = rightVPoint;
    }
    /*Parabola x coordinate is the x from the (x,y) of the point between the vPoint the leftPoint(or rightPoint)
      Parabola y coordinate is the sweep line y - the distance from the sweep line at x to the vPoint
    */
    public void calcPara(VPoint sweep){
        VPoint midPoint = getMidPoint(vPoint,leftVPoint);
        VPoint pointOnSweep = new VPoint(midPoint.getX(),sweep.getY());
        paraLeft = pointOnSweep;
        midPoint = getMidPoint(vPoint,rightVPoint);
        pointOnSweep = new VPoint(midPoint.getX(),sweep.getY());
        paraRight = pointOnSweep;
    }

    private VPoint getMidPoint(VPoint p1, VPoint p2) {
        int midPointX = (p1.getX() + p2.getX()) / 2;
        int midPointY = (p1.getY() + p2.getY()) / 2;
        VPoint midPoint = new VPoint(midPointX, midPointY);
        return midPoint;
    }

    public VPoint getLeftVPoint() {
        return leftVPoint;
    }

    public void setLeftVPoint(VPoint leftVPoint) {
        this.leftVPoint = leftVPoint;
    }

    public VPoint getRightVPoint() {
        return rightVPoint;
    }

    public void setRightVPoint(VPoint rightVPoint) {
        this.rightVPoint = rightVPoint;
    }

    public VPoint getParaLeft() {
        return paraLeft;
    }

    public void setParaLeft(VPoint paraLeft) {
        this.paraLeft = paraLeft;
    }

    public VPoint getParaRight() {
        return paraRight;
    }

    public void setParaRight(VPoint paraRight) {
        this.paraRight = paraRight;
    }
}
