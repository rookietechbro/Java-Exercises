import ProjectsByOnyii.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testThatCalculatorCanBeTurnedOn() {
        //Given that I have a new calculator
        Calculator casio = new Calculator();

        //When I turn it on
        casio.turnOn();
        
        //Check that it is on
        Assertions.assertTrue(casio.isOn());
    }

    @Test
    public void testThatICanTurnOffACalculator(){
        //Given that I have a calculator andI turn it on
    Calculator casio = new Calculator();
    casio.turnOn();
        //When I turn it off
    casio.turnOff();
        //Check that it is off
    assertFalse(casio.isOn());
    }

    @Test
    public void testThatICanAddNumbersWithMyCalculator(){
        //Given that I have a calculator and I turn it on
        Calculator casio = new Calculator();
        casio.turnOn();
        //When I add numbers
        casio.add(2, 2);
        //Check that total of numbers is correct
        int expected = 4;
        int actual = casio.getTotal();
        assertEquals(expected ,actual);
    }

}
