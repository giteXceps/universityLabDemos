public class AudioBook extends Publication {
        private String narrator;
    
        public AudioBook(String title, double price, String narrator) {
            super(title, price);
            this.narrator = narrator;
        }
    
        @Override
        public void displayInfo() {
            System.out.println("Magazine title: " + title);
            System.out.println("Issue " + narrator);
            System.out.println("Price: $" + price);
        }
    }    
