import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpecialCharacterSeparator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Girilecek kelime sayisi");
        int count = scanner.nextInt();
        scanner.nextLine();

        List<String> words = new ArrayList<String>();

        for( int i=0; i< count ; i++){
            System.out.print("String Girin: ");
            String word = scanner.nextLine();
            words.add(word);
        }

        List<String> specialCharacters = new ArrayList<>();
        List<String> alphanumericCharacters = new ArrayList<>();

        for(String word : words){
            StringBuilder specialBuilder = new StringBuilder();
            StringBuilder alphanumericBuilder = new StringBuilder();

            for(char c : word.toCharArray()){
                if(Character.isLetterOrDigit(c)){
                    alphanumericBuilder.append(c);
                }else{
                    specialBuilder.append(c);
                }
            }

            if (specialBuilder.length() > 0){
                specialCharacters.add(specialBuilder.toString());
            }

            if (! alphanumericBuilder.isEmpty()){
                alphanumericCharacters.add(Character.toUpperCase(alphanumericBuilder.charAt(0))+ alphanumericBuilder.substring(1));
            }
        }

        System.out.println("Ozel karakterler");
        for (String special : specialCharacters){
            System.out.println(special);
        }

        System.out.println("Harf ve sayi iceren karakterler");
        for (String alphanumeric : alphanumericCharacters){
            System.out.println(alphanumeric);
        }
        scanner.close();
    }
}
