import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) throws ParseException {
        ClassStu classStu1 = new ClassStu(1,"T2109M");
        ClassStu classStu2 = new ClassStu(2,"T2108M");
        Student student1 ;
        student1 =new Student(1,"Vũ Viêt Quý","28-01-2003",classStu1,1) ;

        System.out.println(student1.getDateOfBirth());



    }
}
