package point;

/*
Author : Quy Vu
*/
public class Point3D extends Point2D{
    private float z;

    public Point3D() {
        super();
        z=0;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        return new float[] {super.getX(),super.getY(),z};
    }

    public void setXYZ(int x,int y,int z){
        super.setXY(x,y);
        this.z =z;
    }

    @Override
    public String toString() {
        return String.format("(%f,%f,%f)",super.getX(),super.getY(),z);
    }
}
