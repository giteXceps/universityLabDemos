public class Book extends Publication {
    private String author;

    public Book(String title, double price, String author){
        super(title, price);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}
