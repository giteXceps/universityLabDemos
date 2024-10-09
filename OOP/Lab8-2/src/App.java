
public class App {
    public static void main(String[] args) throws Exception {
        try {
            int result = (int) divide (10, -2);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }

    public static double divide(int a, int b) throws NegativeNumberException{
        if(b < 0){
            throw new NegativeNumberException("Bolunen negatif olamaz!");
        }
        return a/b;
    }
}
