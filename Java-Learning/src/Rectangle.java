public class Rectangle {
    int width;
    int height;
    public Rectangle(){
        width = 10;
        height = 20;
    }
    public Rectangle(int width,int height){
        System.out.println ("Parameterized Constructor");
        this.width = width;
        this.height = height;
    }

    void displayDimensions() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);

    }

}
