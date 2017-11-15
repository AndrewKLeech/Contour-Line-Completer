public class VLine {
    private VPoint start, end;
    public VLine(VPoint start, VPoint end){
        this.start = start;
        this.end = end;
    }
    public VLine(int startX, int startY, int endX, int endY){
        this.start = new VPoint(startX,startY);
        this.end = new VPoint(endX,endY);
    }
    public VPoint getStart(){
        return start;
    }
    public VPoint getEnd(){
        return end;
    }
    public void setStartPoint(VPoint newStart){
        start = newStart;
    }
    public void setEndPoint(VPoint newEnd){
        end = newEnd;
    }
    public void setStartCoord(int x, int y){
        start = new VPoint(x,y);
    }
    public void setEndCoord(int x, int y){
        end  = new VPoint(x,y);
    }
}
