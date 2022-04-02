public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        if(!(this.second>=0&&this.second<=59) || !(this.minute>=0&&this.minute<=59) || !(this.hour>=0&&this.hour<=23)){
            System.out.println("No input validation needed.\n");
            this.second = 0;
            this.minute = 0;
            this.hour = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return hour + "/" + minute + "/" + second  ;
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
        Time time1 = new Time(7,0,0);
        Time time2 = new Time(6,59,59);
        System.out.println(time1.previousSecond());
        System.out.println(time2.nextSecond());
    }


}
