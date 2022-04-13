import java.util.Arrays;

/*
Author : Quy Vu
*/
public class Student extends Person {
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private final static int MAX_COURSES = 5;

    public Student(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[MAX_COURSES];
        this.grades = new  int[MAX_COURSES];
    }

    public void  addCourseGrade(String course, int grade){
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades(){
        System.out.println(this);
        for (int i=0;i<numCourses;i++){
            System.out.println(courses[i] +": "+grades[i]);
        }

    }

    public double getAverageGrade(){
        double sum = 0;
        for (int grade:grades) {
            sum+=grade;
        }
        return sum/numCourses;
    }




}
