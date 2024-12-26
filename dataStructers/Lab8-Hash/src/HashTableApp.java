import java.util.Scanner;

public class HashTableApp {
    public static void main(String[] args) {
        DataItem adataItem;
        int key , size , n ,keysPerCell;
        System.out.println("Hash Table boyutunu giriniz: ");
        size = getInt();
        System.out.println("Rastgele eklenecek veri miktarını giriniz: ");
        n = getInt();
        //0-100 arası sayı uretme kat sayısı
        keysPerCell = 100;

        HashTable theHashTable = new HashTable(size);
        for (int i = 0; i < n; i++) {
            key = (int)(java.lang.Math.random()*keysPerCell+size);
            adataItem = new DataItem(key);
            theHashTable.insert(adataItem);

        }
        while(true) {
            System.out.println("İşlem seçiniz: ");  //value ile degeri tuttun
            System.out.println("Göster(g),Ekle(e),Bul(b),Sil(s),Kapat(k)");
            int choice = getChar();
            
            switch (choice) {
                case 'g':
                    theHashTable.displayTable();
                    break;
                case 'e':
                    System.out.println("Eklenecek deger:");
                    int value = getInt();
                    adataItem = new DataItem(value);
                    theHashTable.insert(adataItem);
                    break;
                case'b':
                    System.out.println("Aranacak deger: ");
                    value = getInt();
                    DataItem found = theHashTable.find(value);
                    if(found != null){
                        System.out.println("Bulundu: " + value);
                        System.out.println("");
                    }
                    else{
                        System.out.println("Bulunamadi");
                    }
                    break;
                case 's':
                    System.out.println("Silinecek deger: ");
                    value = getInt();
                    DataItem didDelete = theHashTable.delete(value);
                    if(didDelete != null){
                        System.out.println("Silindi: " + value);
                    }
                    else{
                        System.out.println("Silinemedi!");
                    }
                    break;
                case 'k':
                    Runtime.getRuntime().exit(0);
                default:
                    System.out.println("Hatali giris!");
            }
        }
    }

    public static String getString(){
        Scanner input = new Scanner(System.in);
        //diger kelimeye kadar
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
        //alinan string bir tamsatita donusturulur
        return Integer.parseInt(s);
    }
}