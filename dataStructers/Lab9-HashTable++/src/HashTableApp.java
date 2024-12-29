import java.util.Scanner;

public class HashTableApp {
    public static void main(String[] args) {
        DataItem adataItem;
        int key, size, n, keysPerCell;
        System.out.print("Hash Table boyutunu giriniz: ");
        size = getInt();
        System.out.print("Rastgele eklenecek veri miktarını giriniz: ");
        n = getInt();
        //0-100 arası sayı uretme kat sayısı
        keysPerCell = 100;

        HashTable theHashTable = new HashTable(size);
        for (int i = 0; i < n; i++) {
            key = (int) (java.lang.Math.random() * keysPerCell + size);
            adataItem = new DataItem(key);
            theHashTable.insert(adataItem);

        }
        while (true) {
            System.out.print("İşlem seçiniz: ");  //value ile degeri tuttun
            System.out.print("Göster(g),Ekle(e),Bul(b),Sil(s),Kapat(k)");
            int choice = getChar();
            switch (choice) {

                case 'g':
                    theHashTable.displayTable();
                    break;
                case 'e':
                    System.out.print("Eklenecek deger:");
                    int value = getInt();
                    adataItem = new DataItem(value);
                    theHashTable.insert(adataItem);
                    break;
                case 'b':
                    System.out.print("Aranacak deger: ");
                    value = getInt();
                    DataItem found = theHashTable.find(value);
                    if (found != null) {
                        System.out.print("Bulundu: " + value);
                        System.out.print("");
                    } else {
                        System.out.print("Bulunamadi!");
                    }
                    break;
                case 's':
                    System.out.print("Silinecek deger: ");
                    value = getInt();
                    DataItem didDelete = theHashTable.delete(value);
                    if (didDelete != null) {
                        System.out.print("Silindi: " + value);
                    } else {
                        System.out.print("Silinemedi!");
                    }
                    break;
                case 'k':
                    Runtime.getRuntime().exit(0);
                default:
                    System.out.println("Hatali giris!");

            }
        }
    }//end switch

    public static String getString() {
        Scanner input = new Scanner(System.in);
        //diger kelimeye kadar oku
        //giris = "Sivas Cumhuriyet"
        //cikis = "Sivas"
        String s = input.next();
        return s;
    }

    public static char getChar(){
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt(){
        //giris almak icin
        String s = getString();
        //alinan string bir tamsayiya donusturulur
        return Integer.parseInt(s);
    }
}