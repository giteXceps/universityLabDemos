public class App {
    public static void main(String[] args) throws Exception {
        Publication[] publications = new Publication[3];
        publications[0] = new Book("Java Programming", 29.99, "John Doe");
        publications[1] = new Magazine("Java Monthly", 5.99, "December 2024");
        publications[2] = new AudioBook("Learn Java in 30 Days", 19.99, "Jane Smith");

        for(Publication publication : publications){
            publication.displayInfo();
            System.out.println();
        }
    }
}
