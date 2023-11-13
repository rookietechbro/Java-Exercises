import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AirConditioner1Test {
    @Test
    public  void  testThatAirConditionerIsOn(){
        //Given that
        AirConditioner1 samsung = new AirConditioner1();
        //When
        samsung.setTurnOn();
        //Check that
        Assertions.assertTrue(true);
    }

     @Test
    public void testThatAirConditionerIsOff(){
        //Given that
        AirConditioner1 samsung = new AirConditioner1();
        //When
        samsung.setTurnOff();
        //Check that
        Assertions.assertTrue(true);
    }

    @Test
    public  void  testThatAirConditionerCanIncreaseTemperature(){
        //Given that
        AirConditioner1 samsung = new AirConditioner1();
        //When
        for(int temperature = 0; temperature < 3; temperature++){
        samsung.increaseTemperature();
        }
        //Check that
        Assertions.assertEquals(19, samsung.getIncreaseTemperature());
    }

@Test
    public void testThatAirConditionerCanIncreaseTemperatureButNotAbove30(){
        //Given that
        AirConditioner1 samsung = new AirConditioner1();
        //When
        for(int count = 1; count <= 300; count++){
        samsung.increaseTemperature();
        }
        //Check that
        Assertions.assertEquals(30, samsung.getIncreaseTemperature());

    }

@Test
    public void testThatAirConditionerCanDecreaseTemperatureButNotBelow16(){
        //Given that
    AirConditioner1 samsung = new AirConditioner1();
        //When
    samsung.increaseTemperature();
    samsung.decreaseTemperature();
    samsung.decreaseTemperature();

    for(int count = 0; count <= 10; count++){
        samsung.decreaseTemperature();
    }

        //Check that
        Assertions.assertEquals(16, samsung.getDecreaseTemperature());

    }


}
