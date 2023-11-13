package ChallengesFromOtherSources.SetAndGet;

public class ClockTest {
    public static void main(String[] args) {
        Clock displayTime = new Clock();

        displayTime.setHour(12);
        displayTime.setMinute(59);
        displayTime.setSecond(59);

        displayTime.getHour();
        displayTime.getMinute();
        displayTime.getSecond();

        System.out.printf("The time is %s:%s:%s" , displayTime.getHour() ,displayTime.getMinute() , displayTime.getSecond());
    }
}
