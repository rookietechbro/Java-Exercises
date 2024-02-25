package TEST;

import ProjectsByOnyii.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarApplicationTest {
    @Test
    public void testThatFirstCarExists(){
        Car mercedes = new Car("G-Wagon", "2023", 4_000, 0);
        assertNotNull(mercedes);
    }
    @Test
    public void testThatICanApplyA5_PercentDiscountOnTheMercedes(){
        Car mercedes = new Car("G-Wagon", "2023", 4_000, 5);
        double price = mercedes.getPrice();
        assertEquals(3800.0, mercedes.getPrice());
    }

    @Test
    public void testThatSecondCarExists(){
        Car toyota = new Car("Camry", "2023", 3_000,0);
        assertNotNull(toyota);
    }

    @Test
    public void testThatICanApplyA5_PercentDiscountOnTheCamry(){
        Car camry = new Car("Camry", "2023", 3_000, 7);
        double price = camry.getPrice();

        assertEquals(2790.0, camry.getPrice());
    }

}
