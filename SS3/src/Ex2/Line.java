package Ex2;

public class Line {
    private Point begin,end;

    public Line(int x1,int y1,int x2,int y2) {
        this.begin = new Point(x1,y1);
        this.end = new Point(x2,y2);
    }

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }
    public void setBeginY(int y) {
         begin.setY(y);
    }

    public int[] getBeginXY(){
      return  begin.getXY();
    }

    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }

    public void setEndX(int x) {
        end.setX(x);
    }
    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getEndXY(){
        return  end.getXY();
    }

    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }

    public double getlength() {
        return begin.distance(end);
    }


}
