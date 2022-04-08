import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private int rollNo;
    private String studentName;
    private String dateOfBirth;
    private ClassStu classCurrent;
    private int status;



    public Student(int rollNo, String studentName, String dateOfBirth, ClassStu classCurrent, int status) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
        this.classCurrent = classCurrent;
        this.status = status;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getDateOfBirth() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        dateFormat.setLenient(false);
        try {
            date = dateFormat.parse(dateOfBirth);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return date;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassCurrentName() {
        return classCurrent.getClassName();
    }

    public void setClassCurrent(ClassStu classCurrent) {
        this.classCurrent = classCurrent;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", studentName='" + studentName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", classCurrent=" + classCurrent +
                ", status=" + status +
                '}';
    }


}
