public abstract class Publication {
    protected String title;
    protected double price;

    public Publication(String title, double price){
        this.title = title;
        this.price = price;
    }

    public abstract void displayInfo();
}
