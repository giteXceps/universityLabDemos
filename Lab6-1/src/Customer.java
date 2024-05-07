public class Customer {
    private BankAccount account;

    public Customer(BankAccount account){
        this.account = account;
    }

    public void displayBalance(){
        System.out.println("Current balance: " + account.balance);
    }

    public void deposit(double amount){
        account.deposit(amount);
    }

    public void withdraw(double amount){
        account.withdraw(amount);
    }
}
