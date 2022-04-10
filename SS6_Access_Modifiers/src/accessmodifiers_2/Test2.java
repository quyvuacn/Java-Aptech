package accessmodifiers_2;
import accessmodifiers_1.AccessModifiers;

public class Test2 extends AccessModifiers{

   public String getProtected(){
       return _protected; //Sử dụng protected với quan hệ cha con
   }

    public static void main(String[] args) {
        Test2 test = new Test2();
        System.out.print(test.getProtected());
    }
}
