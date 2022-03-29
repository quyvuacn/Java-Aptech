public class Student {
    String studentName;
    int studentAge;

    public void setStudent(int studentAge,String studentName) {
        this.studentAge = studentAge;
        this.studentName = studentName;
    }

    void display(){
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
    }

    public static void main(String[] args) {
        Student objStu = new Student();
        objStu.setStudent(19,"Vu Viet Quy");
        objStu.display();
    }
}
