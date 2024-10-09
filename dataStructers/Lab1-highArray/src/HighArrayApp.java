public class HighArrayApp {
    public static void main(String[] args) throws Exception {
        int maxSize = 100;
        HighArray dizi = new HighArray(maxSize);

        // ekleme
        dizi.insert(25);
        dizi.insert(66);
        dizi.insert(88);
        dizi.insert(99);
        dizi.insert(55);
        dizi.insert(7);
        dizi.insert(9);
        dizi.insert(4);
        dizi.insert(19);
        dizi.insert(58);

        // yazdirma
        dizi.display();

        // arama
        int searchKey = 55;
        if (dizi.find(searchKey)) {
            System.out.println("Eleman bulundu: " + searchKey);
        } else {
            System.out.println("Eleman bulunamadi: " + searchKey);
        }

        // silme
        dizi.delete(88);
        dizi.delete(99);
        dizi.delete(66);

        // yazdirma
        dizi.display();
    }
}
