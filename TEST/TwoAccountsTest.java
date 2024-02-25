import org.junit.jupiter.api.Test;
import Chapter3DAndD.TwoAccounts;
import static org.junit.jupiter.api.Assertions.*;

public class TwoAccountsTest {
    @Test
    public void testThatIHaveTwoAccountsWithNamesAndBalances() {
        TwoAccounts account1 = new TwoAccounts("Amos", 0.0);
        TwoAccounts account2 = new TwoAccounts("Bob", 71.64);
        assertNotNull(account1);
        assertNotNull(account2);
    }
    @Test
    public void thatICanRemoveDuplicatedCodesInMain(){
        TwoAccounts account = new TwoAccounts("Amos", 0.0);
        String displayMessage = account.displayAccount(account);
        assertEquals("Account balance of Amos is 0.0", displayMessage);
    }
}
