package TEST;

import ProjectsByOnyii.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void testThatIHaveAnAccount(){
        Account freshAccount = new Account();
        assertNotNull(freshAccount);
    }
  @Test
  public void testThatICanDepositMoney(){
      Account freshAccount = new Account();
      freshAccount.deposit(50);
      assertEquals(50, freshAccount.getBalance());
  }
 @Test
  public void testThatICanWithdrawMoney(){
      Account freshAccount = new Account();
      freshAccount.deposit(100);
      freshAccount.withdraw(40);
      assertEquals(60, freshAccount.getBalance());
  }

 @Test
  public void testThatICantWithdrawMoreMoneyThanIsInTheAccount(){
      Account freshAccount = new Account();
      freshAccount.deposit(100);
      freshAccount.withdraw(1000);
      assertEquals(100, freshAccount.getBalance());
  }


}