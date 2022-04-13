package ex_instanceof;

/*
Author : Quy Vu
*/
public class ex_instanceof {
    public static void main(String[] args) {

        /**
         * downcast : ép biến a từ float thành int và gán cho b.
         * Note : b chỉ gán cho giá trị của a khi ép kiểu, còn a vẫn không thay đổi
         */
        float a = 5.25f;
        int b = (int) a;
        System.out.println(b);

        /**
         * upcast : c được ép ngầm định thành float và gán cho d.
         * Note : d chỉ gán cho giá trị của a khi ép kiểu, còn c vẫn không thay
         */
        int c =5;
        float d = c;




    }
}
