public class App {
    public static void main(String[] args) throws Exception {
        CustomerValidator customerValidator = new CustomerValidator();
            customerValidator.CustomerNameValidator("");
            customerValidator.CustomerEmailValidator("sefametin68gmail.com");
            customerValidator.processOrder(2);
            //System.out.println("Hata mesaji: " + e.getMessage());
    }
}
