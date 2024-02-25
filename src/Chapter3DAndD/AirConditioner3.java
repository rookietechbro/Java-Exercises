package ProjectsByOnyii;

public class AirConditioner3 {
    private boolean isOn = false;
    private int temperature;

    public void decreaseTemperature() {
        for (int temperature = 30; temperature >= 16; temperature--) {
            temperature -= 1;
        }
    }
    public int getTemperature(){
        return temperature;
    }
    public void increaseTemperature() {
        for (int temperature = 16; temperature <= 30; temperature++) {
            temperature += 1;
        }
    }
    public void turnItOn() {
    }




}
