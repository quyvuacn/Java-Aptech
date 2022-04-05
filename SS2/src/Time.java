public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {

        if(!(minute >= 0 && minute <= 59) || !(hour >= 0 && hour <= 23)){

            System.out.println("No input validation needed.\n");
            this.second = 0;
            this.minute = 0;
            this.hour = 0;
        }else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour>23 || hour<0){
            System.out.println("Err");
        }else {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute>60 || minute<0){
            System.out.println("Err");
        }else {
            this.minute = minute;
        }

    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second>60 || second<0){
            System.out.println("Err");
        }else {
            this.second = second;
        }

    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%02d",hour,minute,second)  ;
    }
    public Time nextSecond(){
        if(second<59){
            second++;
        }else if(minute<59){
                minute++;
                second=0;
        }else if(hour<23){
            hour++;
            minute=0;
            second=0;
        }else {
            hour=0;
            minute=0;
            second=0;
        }

        return this;
    }
    public Time previousSecond(){
        if(second>0){
            second--;
        }else if(minute>0){
            minute--;
            second=59;
        }else if(hour>0){
            hour--;
            minute=59;
            second = 59;
        }else {
            hour=23;
            minute=59;
            second=59;
        }

        return this;
    }

    public static void main(String[] args) {
        Time time1 = new Time(7,60,0);
        Time time2 = new Time(6,59,59);
        System.out.println(time1.previousSecond());
        System.out.println(time2.nextSecond());
    }


}
