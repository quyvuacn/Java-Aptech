public class Rectangle {

    private float width;
    private float length;

    public Rectangle(){
        width= 1.0f;
        length = 1.0f;
    }
    public  Rectangle(float width,float length){
        this.width=width;
        this.length=length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public double getArea(){
        return length*width;
    }

    private double getHalf (){
        return length+width;
    }

    public double getPerimetere(){
        return 2*this.getHalf();
    }
//toString trả về một chuỗi mô tả về đối tượng khi ta in ra đối tượng
    public String toString(){
       return  "Rectangle[width = " + width + ",length = " + length +"]" ;
    }


}
