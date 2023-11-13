public class AirConditioner1 {
    private boolean isOn = false;
    private int temperature = 16;



    public void setTurnOn(){
        isOn = true;
    }


    public void setTurnOff() {
        isOn = false;
    }

    public void increaseTemperature() {
        if (temperature >= 16 && temperature < 30) {
            temperature = temperature += 1;
        }
    }
    public int getIncreaseTemperature(){
        return temperature;
    }

    public void decreaseTemperature() {
        if (temperature > 16 && temperature <= 30) {
            temperature = temperature -= 1;
        }
    }
    public int getDecreaseTemperature(){
        return temperature;
    }
}
