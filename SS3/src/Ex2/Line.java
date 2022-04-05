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

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
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

    public void setBeginXY(int x,int y){
        begin.setX(x);
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
    public void setEndXY(int x,int y){
        end.setX(x);
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

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient(){
        double x = begin.getX()-end.getX();
        double y = begin.getY()-end.getY();
        return Math.atan2(y,x);
    }

    public double distance(int x, int y){
        double x1=begin.getX();
        double y1=begin.getY();
        double x2=end.getX();
        double y2=end.getY();
        double t = (y1-y2)*(x-x1) + (x2-x1)*(y-y1);
        double m = Math.sqrt((y1-y2)*(y1-y2)+(x1-x2)*(x1-x2));
        double res = Math.abs(t/m);
        return  res;
    }

    public double distance(Point point){
        double x1=begin.getX();
        double y1=begin.getY();
        double x2=end.getX();
        double y2=end.getY();
        double t = (y1-y2)*(point.getX()-x1) + (x2-x1)*(point.getY()-y1);
        double m = Math.sqrt((y1-y2)*(y1-y2)+(x1-x2)*(x1-x2));
        double res = Math.abs(t/m);
        return  res;
    }


    public boolean intersects(Line another){
        double x1=another.getBeginX(); //31
        double y1=another.getBeginY();//34
        double x2=another.getEndX();//32
        double y2=another.getEndY();//33

        double check1 = (y1-y2)*(begin.getX()-x1) + (x2-x1)*(begin.getY()-y1);
        double check2 = (y1-y2)*(end.getX()-x1) + (x2-x1)*(end.getY()-y1);

        if(check1*check2<0){
            return true;
        } else {
            return false;
        }





    }




}
