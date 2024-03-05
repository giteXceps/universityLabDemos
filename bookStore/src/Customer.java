public class Customer {
    private String email;
    private String name;
    private double balance;

    public Customer(String email, String name, double balance) {
        this.email = email;
        this.name = name;
        this.balance = balance;
    }

    public Customer(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void buyBook(double price){
        if (balance < price){
            throw new IllegalArgumentException("Yetersiz Bakiye!");
        }
        balance-=price;
    }

    public void addBalance(double amount){
        balance+=amount;
    }
}
