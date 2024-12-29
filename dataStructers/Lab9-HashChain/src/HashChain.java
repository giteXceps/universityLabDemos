import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HashChain {
    public static void main(String[] args) throws IOException {
        int aKey;
        Link aDataItem;
        int size, n, keysPerCell = 100;
        System.out.println("Hash Table boyutu: ");
        size = getInt();
        System.out.println("Eklenecek rastgele deger sayisi: ");
        n = getInt();
        HashTable theHashTable = new HashTable(size);

        for (int j = 0; j < n; j++) {
            aKey = (int) (Math.random() * keysPerCell + size);
            aDataItem = new Link(aKey);
            theHashTable.insert(aDataItem);
        }

        while (true) {
            System.out.print("İşlem seçiniz: "); // value ile degeri tuttun
            System.out.print("Göster(g),Ekle(e),Bul(b),Sil(s),Kapat(k)");
            int choice = getChar();
            switch (choice) {

                case 'g':
                    theHashTable.displayTable();
                    break;
                case 'e':
                    System.out.print("Eklenecek deger:");
                    aKey = getInt();
                    aDataItem = new Link(aKey);
                    theHashTable.insert(aDataItem);
                    break;
                case 'b':
                    System.out.print("Aranacak deger: ");
                    aKey = getInt();
                    aDataItem = theHashTable.find(aKey);
                    if (aDataItem != null) {
                        System.out.print("Bulundu: " + aKey);
                        System.out.print("");
                    } else {
                        System.out.print("Bulunamadi!" + aKey);
                    }
                    break;
                case 's':
                    System.out.print("Silinecek deger: ");
                    aKey = getInt();
                    theHashTable.delete(aKey);
                    break;
                case 'k':
                    Runtime.getRuntime().exit(0);
                default:
                    System.out.println("Hatali giris!");

            }
        }
    }// end switch

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        // giris almak icin
        String s = getString();
        // alinan string bir tamsayiya donusturulur
        return Integer.parseInt(s);
    }
}