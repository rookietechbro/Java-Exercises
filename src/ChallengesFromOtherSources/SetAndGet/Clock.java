package ChallengesFromOtherSources.SetAndGet;

public class Clock {
    private int hour;
    private int minute;
    private int second;


    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        if (hour > 23)  return 0;
        return hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        if (minute > 59) return 0;
        return minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSecond() {
        if(second > 59) return 0;
        return second;
    }
    //Provide a method displayTime that displays the time in an “hh:mm:ss” format


}