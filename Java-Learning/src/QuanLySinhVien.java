import java.util.Scanner;

public class QuanLySinhVien {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Tên sinh vien: " + name);
        System.out.println("Tuoi sinh vien: " + age);
    }
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        QuanLySinhVien sv = new QuanLySinhVien();
        System.out.println("Moi ban nhap so sinh vien can them ");
        n = in.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("Moi ban nhap ten sinh vien thu " + (i +1) );
            String name ;
            name = in.next();
            sv.setName(name);
            System.out.println("Moi ban nhap tuoi sinh vien thu " + (i+1));
            int age;
            age = in.nextInt();
            sv.setAge(age);
            sv.display();
        }




    }
}
