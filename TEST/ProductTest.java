import Chapter3DAndD.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void testThatICanMultiplyTwoNumbers(){
        int result = Product.multiply(3, 5);
        assertEquals(15, result);
    }
     @Test
    public void testThatICanMultiplyThreeNumbers(){
        int result = Product.multiply(3, 5, 1);
        assertEquals(15, result);
    }
    @Test
    public void testThatICanMultiplyAnyGivenAmountOfNumbers(){
        int result = Product.multiply(1, 4, 6, 1);
        assertEquals(24, result);
    }
}