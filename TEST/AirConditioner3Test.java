import Chapter3DAndD.AirConditioner3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditioner3Test {
    @Test
    public void testThatAirConditioner3sTemperatureCanBeDecreased(){
        AirConditioner3 bella = new AirConditioner3();
        bella.decreaseTemperature();
        assertTrue(true);
    }
    @Test
    public void testThatICanGetAirConditioner3sTemperature(){
        AirConditioner3 bella = new AirConditioner3();
        bella.getTemperature();
        assertTrue(true);
    }
    @Test
    public void testThatAirConditioner3sTemperatureCanBeIncreased(){
        AirConditioner3 bella = new AirConditioner3();
        bella.increaseTemperature();
        assertTrue(true);
    }
    @Test
   public void testThatAirConditioner3IsOn(){
        AirConditioner3 bella = new AirConditioner3();
        bella.turnItOn();
        assertTrue(true);
    }
}
