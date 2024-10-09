import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Parolanizi girin: ");
        String password = scanner.nextLine();

        if(isValidPassword(password)){
            System.out.println("Parola gecerli!");
        } else {
            System.out.println("Parola gecerli degil!");
        }
        scanner.close();
    }

    public static boolean isValidPassword(String password){
        String regex = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z]\\w{7,14}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
