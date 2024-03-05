public class Book {
    private double price;
    private String author;
    private int publisherYear;
    private String name;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public Book(double price, String author, int publisherYear, String name) {
        this.price = price;
        this.author = author;
        this.publisherYear = publisherYear;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
