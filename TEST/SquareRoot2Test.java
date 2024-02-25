package TEST;

import ProjectsByOnyii.SquareRoot2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareRoot2Test {
    @Test
    public void testThatICanSquareRootANumber(){
        double result = SquareRoot2.squareRootThisNumber(4);
        assertEquals(result, 2);
    }
}
