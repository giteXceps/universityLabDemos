public class BookStore {
    public static void main(String[] args){
        Book[] books= {
                new Book(600, "Robert C. Martin", 2008, "Clean Code"),
                new Book(1200,"Joshua Bloch",2017,"Effective Java")
        };
        System.out.println("Kitaplar basariyla eklendi");

        Customer[] customers = {
                new Customer("gazizoglu@cumhuriyet.edu.tr","Gokhan Azizoglu",2000)
        };
        System.out.println("Musteriler basariyla eklendi");

        double balance = 0;

        String email = "gazizoglu@cumhuriyet.edu.tr";
        Customer foundCustomer = null;
        for(Customer c : customers){
            if(c.getEmail().equals(email)){
                foundCustomer = c;
                break;
            }
        }
        if(foundCustomer == null){
            throw new IllegalArgumentException("Musteri bulunamadi!");
        }

        String bookName = "Clean Code";
        Book foundBook = null;
        for(Book b : books){
            if(b.getName().equals(bookName)){
                foundBook = b;
                break;
            }
        }
        if(foundBook == null){
            throw new IllegalArgumentException("Kitap bulunamadi!");
        }

        try {
            foundCustomer.buyBook(foundBook.getPrice());
            balance+= foundBook.getPrice();
            System.out.println("\nKitap basariyla satin alindi!");
        } catch(IllegalArgumentException e){
            System.out.println("\n"+e.getMessage());
        }

        System.out.println("Bakiye: " + balance);
    }
}
