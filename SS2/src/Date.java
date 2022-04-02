public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

        if(!(this.day>=1&&this.day<=31) || !(this.month>=1&&this.month<=12) || !(this.year>=1900&&this.year<=9999)){
            System.out.println("No input validation needed.\n");
            this.day = 1;
            this.month = 1;
            this.year = 1900;
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
        String day="",month="";

        if (this.day<10){
            day = "0"+this.day;
        }
        if (this.month<10){
            month = "0"+this.month;
        }

        return day+"/"+month+"/"+year;
    }

    public static void main(String[] args) {
        Date date = new Date(1,1,1999);
        System.out.println(date);
    }


}
