
public class Cricle {
    private double radius;
    public Cricle(){
        radius= 1;
    }
    public Cricle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Cricle[" +
                "radius=" + radius +
                ']';
    }
}
