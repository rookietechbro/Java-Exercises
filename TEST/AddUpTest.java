package TEST;

import ProjectsByOnyii.AddUp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddUpTest {

    @Test
    public void testForTheSumOfTwoNumbers(){
        int result = AddUp.sum(1, 2);
        assertEquals(result, 3);
    }  @Test
    public void testForTheSumOfTwoDifferentNumbers(){
        int result = AddUp.sum(5, 6);
        assertEquals(result, 11);
    }  @Test
    public void testForTheSumOfThreeDifferentNumbers(){
        int result = AddUp.sum(5, 6, 1);
        assertEquals(result, 12);
    }  @Test
    public void testForTheSumOfVaryingNumbers(){
        int result = AddUp.sum(5, 6, 1, 100, 4000, 5000);
        assertEquals(result, 9112);
    }
}
