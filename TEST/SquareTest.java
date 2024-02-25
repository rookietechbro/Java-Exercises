import Chapter3DAndD.Square;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    public void testForTheSquareOfTwoNumbers(){
        int result = Square.squareOfTwoNumbers(2, 2);
        assertEquals(4, result);
    }
}
