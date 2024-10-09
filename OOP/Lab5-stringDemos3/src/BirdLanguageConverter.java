import java.util.Scanner;

public class BirdLanguageConverter {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String sentence = scanner.nextLine();

        String convertedSentence = converttoBirdLanguage(sentence);
        System.out.println("Kus diline cevrilmis hali: " + convertedSentence);
        scanner.close();
    }

    public static String converttoBirdLanguage(String sentence){
        StringBuilder result = new StringBuilder();
        String[] words =sentence.split(" ");

        for(String word : words){
            char firstLetter = word.charAt(0);
            String restOfWord = word.substring(1);

            String convertedword =restOfWord + firstLetter + "ay";
            result.append(convertedword).append(" ");
        }
        return result.toString().trim();
    }
}
