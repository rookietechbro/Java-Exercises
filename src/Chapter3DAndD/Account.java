package Chapter3DAndD;
/*
3.11 (Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw that withdraws money from an Account. Ensure that the withdrawal amount does not exceed
the Account’s balance. If it does, the balance should be left unchanged and the method should print
a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
(Fig. 3.9) to test method withdraw
 */

public class Account {
    private String name;
    private int balance;

    public Account() {
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return null;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (balance > amount) {
            balance -= amount;
        } else {
            System.out.println("Ole, withdrawal amount has exceeded account balance.");
        }
    }
}