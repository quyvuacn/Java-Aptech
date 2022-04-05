import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if(!(day>=1&&day<=31 &&month>=1&&month<=12 && year>=1900&&year<=9999 && CheckCalendar(day,month,year) ) ){
            System.out.println( day+"/"+month+"/"+year+": "+"No input validation needed.\n");
        }else {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public boolean CheckCalendar(int day,int month,int year)  {
        String dateString = day+"-"+month+"-"+year;
        SimpleDateFormat  calendar = new SimpleDateFormat("dd-MM-yyyy");
       calendar.setLenient(false);

        try {
            calendar.parse(dateString);//Nếu định dạng ngày sai sẽ bắn ra lỗi
            return true;
        }
        catch (ParseException e) {
            return false; // Có lỗi thì trả về định dạng ngày giờ sai
        }

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return String.format("%02d/%02d/%4d",day,month,year);
    }

    public static void main(String[] args) {
        Date date = new Date(30,2,2000);
        Date date1 = new Date(5,4,2022);
        System.out.println(date1);

        


    }


}
