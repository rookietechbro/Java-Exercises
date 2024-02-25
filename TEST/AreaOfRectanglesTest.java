package TEST;

import ProjectsByOnyii.AreaOfRectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaOfRectanglesTest {
    @Test
    public void testForTheAreaOfThisRectangle(){
       int result = AreaOfRectangle.areaOfThisRectangle (10, 2);
       assertEquals(20, result);
    }
}
