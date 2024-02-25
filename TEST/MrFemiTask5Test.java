import ParkingLot.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MrFemiTask5Test {
    @Test
    public void testThatIHaveACalculator(){
        Calculator coolCalc = new Calculator();
        assertNull(null);
    }
    @Test
    public void testThatIHaveACalculatorThatMulipliesNumbers(){
        Calculator coolCalc = new Calculator();
        coolCalc.multiplyNumbers();
        assertEquals(12, 5);
    }
}
