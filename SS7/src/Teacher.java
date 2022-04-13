import java.util.Arrays;

/*
Author : Quy Vu
*/
public class Teacher extends Person {
    private final static int MAX_COURSES = 5;
    private int numCourses;
    private String[] courses;

    public Teacher(String name, String address) {
        super(name, address);
        numCourses =0;
        courses = new String[MAX_COURSES];
    }



    public boolean addCourse(String course) {
        if(courses.equals(null)){
            for (String item : courses) {
                if (course.equals(item)) {
                    return false;
                }
            }
        }
        courses[numCourses]=course;
        numCourses++;
        return true;
    }

    public boolean removeCourse(String course) {
        if(!(courses.equals(null))){
            for (String item : courses) {
                if (course.equals(item)) {
                    return true;
                }
            }
        }
        return false;
    }

}
