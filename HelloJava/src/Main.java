public class Main {
    private int id;
    private String name;


    public static void main(String[] args) {

        TamGiac tg = new TamGiac();
        HinhVuong hv = new HinhVuong();
        Dog dog = new Dog();
        tg.TamGiac();

        dog.Dog();


        int num1=1,num2=2,num3=3,num4=4;
        int sum;
        sum = num1 + num2 + num3 + num4;
        System.out.println("Tổng 4 số là : "+sum);

        RectangleComputation hcn = new RectangleComputation();
        hcn.RectangleComputation(4,5);
    }
}
