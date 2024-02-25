import Chapter3DAndD.HeartRates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HeartRatesTest {
    @Test
    public void testThatIHaveCreatedAClass(){
        HeartRates freshHeartRate = new HeartRates("joe", "freeman", "7", "october", 1955);
        assertNotNull(freshHeartRate);
    }
    @Test
    public void testThatICanCalculateAPersonsAge() {
        HeartRates freshHeartRate = new HeartRates("joe", "freeman", "7", "october", 1955);
        int age = freshHeartRate.calculateAndReturnAPersonsAge();
        assertEquals(34, 34);
    }
    @Test
    public void testThatICanCalculateAPersonsMaximumHeartRate() {
        HeartRates freshHeartRate = new HeartRates("joe", "freeman", "7", "october", 1955);
        int maximumHeartRate = freshHeartRate.calculateAndReturnAPersonsMaximumHeartRate();
        assertEquals(152, 152);
    }
    @Test
    public void testThatICanCalculateAPersonsTargetHeartRate() {
        HeartRates freshHeartRate = new HeartRates("joe", "freeman", "7", "october", 1955);
        double targetHeartRate = freshHeartRate.calculateAndReturnAPersonsTargetHeartRate();
        assertEquals(53.2, 53.2);
    }

}
