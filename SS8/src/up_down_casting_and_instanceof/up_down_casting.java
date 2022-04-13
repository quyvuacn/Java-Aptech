package up_down_casting_and_instanceof;

/*
Author : Quy Vu
*/
public class up_down_casting {
    /*up_down_casting : có thể hiểu là 2 kiểu ép kiểu dữ liệu giống với ví dụ ép float thành int
    * Vd: int a = (int) 5.5
    * */
    public static void main(String[] args) {
        A a1 = new C();
        // upcast : ép kiểu từ lớp con sang lớp cha.
        // Biến a1 chỉ biết các phương thức,thuộc tính của lớp A và cha cả A,lớp C thì ko
        /*
        Đây là Constructor A
        Đây là Constructor B
        Đây là Constructor C
        */
        /*
        Lý do : do Constructor C đc gọi bên trong gọi tới Constructor B.
        Constructor B gọi tới Constructor A.
        * */
        System.out.println(a1);
        /*This is C*/
        /**
         * Kiểm tra đối tượng có nằm trong chuỗi kế thừa với class định trc hay không?
         * Nếu có thì có thể ép kiểu
         */
        if(a1 instanceof B){
            B b1 = (B) a1; // downcast : ép kiểu từ lớp cha về lớp con.
            System.out.println(b1);
            /*This is C*/
        }




    }

}
