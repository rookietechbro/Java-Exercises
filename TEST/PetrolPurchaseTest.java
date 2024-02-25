import Chapter3DAndD.Petrol;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PetrolTest {
    @Test
    public void testThatIHaveANewPetrolPurchaseClassAndICanGetBalance() {
        Petrol petrolPurchase = new Petrol("Yaba", "DPK", 50, 100, 5);
        assertNotNull(petrolPurchase);
    }
    @Test
    public void testThatICanSetAllTheParametersInClassPetrol() {
        Petrol petrolPurchase = new Petrol("Ikoyi", "Oil", 5000, 1000.0, 10.0);
        assertEquals("Ikoyi", petrolPurchase.getLocation());
        assertEquals("Oil", petrolPurchase.getPetrolType());
        assertEquals(5000, petrolPurchase.getQuantity());
        assertEquals(1000.0, petrolPurchase.getPurchaseInLitres());
        assertEquals(10.0, petrolPurchase.getPercentageDiscount());
    }

    @Test
    public void testForMethodGetPurchaseAmount() {
        Petrol petrolPurchase = new Petrol("Ikoyi", "Oil", 5, 10.0, 10.0);
        double purchaseAmount = petrolPurchase.getPurchaseAmount();
        assertEquals( 45, purchaseAmount);
    }
}

