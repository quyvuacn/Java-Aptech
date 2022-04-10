package accessmodifiers_1;

public class Test {
    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();
         System.out.println(accessModifiers._public);
         System.out.println(accessModifiers._protected); //Sử dụng protected với cùng package
        System.out.printf(accessModifiers._private);
        System.out.printf(accessModifiers._default);

    }
}
