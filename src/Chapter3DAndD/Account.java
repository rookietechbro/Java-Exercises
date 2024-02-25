package ProjectsByOnyii;

public class Account {
    private String name;
    private int balance;

    public Account() {
    }
    public void deposit(int amount){
        balance += amount;
    }
    public void setName(String name){
        this.name = name;
}

    public String getName(){
        return null;
    }

   public int getBalance() {
        return balance;
   }

    public void withdraw(int amount) {
        if (balance > amount){
        balance -= amount;}
        else{
            System.out.println("Ole, Withdrawal amount exceeded account balance.");
        }
    }
}
