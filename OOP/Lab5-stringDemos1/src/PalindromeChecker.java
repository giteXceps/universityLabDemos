import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir string giriniz: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Girilen string bir palindromdur!");
        } else {
            System.out.println("Girilen string bir palindrom degildir!");
        }
        scanner.close();
    }
    
    public static boolean isPalindrome(String input) {
        input = input.toLowerCase();
        int i = 0;
        int j = input.length() - 1;
    
        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

