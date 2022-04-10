package accessmodifiers_2;
import accessmodifiers_1.AccessModifiers;


public class Test extends AccessModifiers{

    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();
        System.out.println(accessModifiers._public);
        System.out.println(accessModifiers._protected); //Không sử trong cùng package hoặc có quan hệ cha con
//        System.out.printf(accessModifiers._private);
        System.out.printf(accessModifiers._default); //Không lấy thuộc tính _default

    }

}
