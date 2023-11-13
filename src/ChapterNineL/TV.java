package ChapterNineL;

public class TV {

    boolean isOn;
    int channel ;
    int volume;

    public TV() {
    }

    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }
    public void setChannel(int newChannel) {
        if (isOn && channel >= 1 && channel <= 10) {
            this.channel = newChannel;
        }
    }
    public void setVolume(int newVolume) {
        if(isOn && volume >= 1 && volume <= 10){
            this.volume = newVolume;
        }
    }
    public void channelUp() {
        if (isOn && channel <= 10) {
            channel++;
        }
    }
    public void channelDown(){
        if(isOn && channel <= 10) {
            channel--;
        }
    }
    public void volumeUp() {
        if (isOn && channel <= 10) {
            volume++;
        }
    }
    public void volumeDown(){
        if(isOn && channel <= 10) {
            volume--;
        }
    }

}
