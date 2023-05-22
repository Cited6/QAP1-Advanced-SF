public class Time {
    
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        String hourStr = String.format("%02d",hour);
        String minuteStr = String.format("%02d",minute);
        String secondStr = String.format("%02d",second);

        return hourStr + ":" + minuteStr + ":" + secondStr;
    }

    public Time nextSecond(){
        second++;
        if (second == 60){
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;

                }
            }
        }
        return this;
    }

    public Time previousSecond() {
        second--;
        if(second == -1) {
            second = 59;
            minute--;
            if(minute == -1) {
                minute = 59;
                hour--;
                if(hour == -1){
                    hour = 23;
                }
            }
        }
        return this;
    }


    
}
