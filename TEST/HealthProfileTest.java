import Chapter3DAndD.HealthProfile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HealthProfileTest {
    @Test
    public void testThatUserHasAHealthRecord() {
        HealthProfile usersHealthRecord = new HealthProfile("Greg", "I.", "male", 22, 7, 1955, 1.13, 69.19);
        assertNotNull(null, String.valueOf(usersHealthRecord));
    }
    @Test
    public void testThatICanCalculateUsersAgeInYears(){
        HealthProfile usersHealthRecord = new HealthProfile("Peter", "B.", "male", 22, 7, 1955, 1.13, 69.19);
        usersHealthRecord.ageInYears();
        assertEquals(68, usersHealthRecord.ageInYears());
    }
    @Test
    public void testThatICanCalculateUsersMaximumHeartRate(){
        HealthProfile usersHealthRecord = new HealthProfile("Stephanie", "A.", "male", 22, 7, 1955, 1.13, 69.19);
        usersHealthRecord.maximumHeartRate();
        assertEquals(152.0, usersHealthRecord.maximumHeartRate());
    }
    @Test
    public void testThatICanCalculateMUsersTargetHeartRateRange(){
        HealthProfile usersHealthRecord = new HealthProfile("Audrey", "O.", "male", 22, 7, 1955, 1.13, 69.19);
        usersHealthRecord.targetHeartRateRange();
        assertEquals(53, usersHealthRecord.targetHeartRateRange());
    }
    @Test
    public void testThatICanCalculateUsersBMI(){
        HealthProfile usersHealthRecord = new HealthProfile("Mousef", "Indaboski", "male", 22, 7, 1955, 1.13, 69.19);
        usersHealthRecord.BMI();
        assertEquals(54.18591902263295, usersHealthRecord.BMI());
    }

//    @Test
//    public void testThatICanPrintAUsersHealthProfile(){
//        HealthProfile usersHealthRecord = new HealthProfile("Mousef", "Indaboski", "Male", 22,7, 1955,1.13, 69.19)
//        usersHealthRecord.healthProfileInformation();
//        assertEquals
//    }
}
