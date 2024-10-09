import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestWords {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cumle giriniz");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\W+");
        
        List<String> longestWords = new ArrayList<>();
        int maxLength = 0;
        
        for(String word : words){
            int wordLength = word.length();
            if (wordLength > maxLength){
                maxLength = wordLength;
                longestWords.clear();
                longestWords.add(word);
            } else if (wordLength == maxLength) {
                longestWords.add(word);
            }
        }

        System.out.println("En uzun kelimeler: " + longestWords);
        scanner.close();
    }
}
