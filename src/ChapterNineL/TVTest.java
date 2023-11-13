package ChapterNineL;

public class TVTest {
    public static void main(String[] args) {
        TV samsung = new TV();
        TV lg = new TV();

        samsung.turnOn();
        samsung.setChannel(3);
        samsung.setVolume(3);

        lg.turnOn();
        lg.channelUp();
        lg.channelUp();
        lg.volumeUp();

        System.out.println("Samsung's channel is " + samsung.channel + " and volume level is " +  samsung.volume + ".");
        System.out.println("LG's channel is " + lg.channel + " and volume level is " + lg.volume + ".");
    }
}
