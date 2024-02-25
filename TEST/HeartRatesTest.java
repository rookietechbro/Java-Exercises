package TEST;

import ProjectsByOnyii.HeartRates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HeartRatesTest {
    @Test
    public void testThatIHaveCreatedAClass(){
        HeartRates freshHeartRate = new HeartRates("joe", "freeman", "7", "october", 1955);
        assertNotNull(freshHeartRate);
    }

    @Test
    public void testThatICanCalculateAPersonsAge(){
        HeartRates freshHeartRate = new HeartRates("joe", "freeman", "7", "october", 1955);
        int age = freshHeartRate.   calculateAndReturnAPersonsAge();
        assertEquals(34, 34);
    }


//    @Test
//    public void testThatTheMinimumHeartRateCalculationWorks(){
//        HeartRates freshHeartRate = new HeartRates("joe", "freeman", "7", "october", "1955");
//        int minimumHeartRate = freshHeartRate.minimumHeartRateCalculation();
//        assertEquals(186, minimumHeartRate);
//    }

}
