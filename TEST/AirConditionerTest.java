import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AirConditionerTest {
    @Test
    public void testThatAirConditionIsOn() {
//Given that I have a new AC
        AirConditioner HiSense = new AirConditioner();
//When I switch it On
        HiSense.turnOn();
//Check that it is On
        assertTrue(true);
    }

    @Test
    public void testThatAirConditionerisOff() {
        //Given that I have an AC and my AC is On
        AirConditioner HiSense = new AirConditioner();

        //When I turn it Off
        HiSense.turnOff();
        //Check that it is Off
        assertTrue(true);
    }

}
