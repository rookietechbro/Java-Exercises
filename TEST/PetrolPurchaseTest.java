import Chapter3DAndD.PetrolPurchase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PetrolPurchaseTest {
    @Test
    public void testThatIHaveANewPetrolPurchaseClassAndICanGetBalance() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Yaba", "DPK", 50, 100, 5);
        assertNotNull(petrolPurchase);
    }
    @Test
    public void testThatICanSetAllTheParametersInClassPetrol() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Ikoyi", "Oil", 5000, 1000.0, 10.0);
        assertEquals("Ikoyi", petrolPurchase.getLocation());
        assertEquals("Oil", petrolPurchase.getPetrolType());
        assertEquals(5000, petrolPurchase.getQuantity());
        assertEquals(1000.0, petrolPurchase.getPurchaseInLitres());
        assertEquals(10.0, petrolPurchase.getPercentageDiscount());
    }

    @Test
    public void testForMethodGetPurchaseAmount() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Ikoyi", "Oil", 5, 10.0, 10.0);
        double purchaseAmount = petrolPurchase.getPurchaseAmount();
        assertEquals( 45, purchaseAmount);
    }
}

