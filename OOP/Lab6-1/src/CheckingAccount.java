public class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance){
        super(balance);
    }

    public void deposit(double amount){
        balance +=amount;
    }

    public void withdraw(double amount){
        double fee = 0.1*amount;
        if(balance >= amount + fee){
            balance -= amount+fee;
        } else{
            System.out.println("Insufficient funds");
        }
    }
}
