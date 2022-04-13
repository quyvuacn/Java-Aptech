/*
Author : Quy Vu
*/
public class TestPerson {
    public static void main(String[] args) {

//        Test Student
        Student student1 = new Student("Vu Viet Quy","Thai Binh");
        Student student2 = new Student("Nguyen Van A","Ha Noi");
        student1.addCourseGrade("Java",20);
        student1.addCourseGrade("HTML",20);
        student1.printGrades();
        System.out.println("Diem trung binh cac mon cua" + student1.getName() + " la: " + student1.getAverageGrade());

//        Test Teacher
        Teacher teacher1 = new Teacher("Dang Kim Thi","Ha Noi");
        System.out.println(teacher1);

        String[] addCourses = {"Java","HTML","C/C++"};
        /**
         * Test them khoa hoc
         */
        for (String cours:addCourses) {
            if(teacher1.addCourse(cours)){
                System.out.println("Them khoa hoc "+cours+ " thanh cong");
            }else {
                System.out.println("Khoa hoc "+ cours+ " da ton tai");
            }
        }
        /**
         * Test xoa khoa hoc
         */
        String[] removeCourses = {"Java","Javascript"};
        for (String remove:removeCourses) {
            if(teacher1.removeCourse(remove)){
                System.out.println(remove+" da duoc xoa");
            }else {
                System.out.println(remove+" khong ton tai trong danh sach");
            }

        }


    }
}
