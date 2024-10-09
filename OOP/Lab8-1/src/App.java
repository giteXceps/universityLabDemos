import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        int a = scanner.nextInt();
        System.out.println("Sayi giriniz: ");
        int b = scanner.nextInt();
        try {
            double sonuc = a/b;
            System.out.printf("%d / %d = %f",a,b,sonuc);
        } catch (ArithmeticException e) {
            System.err.println("\n Sifira bolme hatasi!");
        } finally {
            scanner.close();
        }
    }
}
