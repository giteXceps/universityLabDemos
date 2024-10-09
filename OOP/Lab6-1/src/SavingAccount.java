public class SavingAccount extends BankAccount {
    public SavingAccount (double balance){
        super(balance);
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        if(balance>=amount){
            balance -= amount;
        }else{
            System.out.println("Insufficient funds");
        }
    }
}
