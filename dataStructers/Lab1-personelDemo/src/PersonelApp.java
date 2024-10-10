public class PersonelApp {
    public static void main(String[] args) throws Exception {
        int maxSize = 100;
        PersonelHareket dizi =  new PersonelHareket(maxSize);

        dizi.insert("Guven", "Ali", 24);
        dizi.insert("Liman", "Semih", 37);
        dizi.insert("Tam", "Ahmet", 43);
        dizi.insert("Ocak", "Mert", 55);
        dizi.insert("Aydin", "Mehmet", 18);
        dizi.insert("Gezer", "Veli", 21);
        dizi.insert("Tozlu", "Kadir", 72);
        dizi.insert("Liman", "Leman", 55);
        dizi.insert("Kus", "Ayse", 25);
        dizi.insert("Taner", "Fatma", 29);
        dizi.display();

        Personel searchedPersonel = dizi.find("Kasap");
        if(searchedPersonel != null){
            System.out.println("Personel bulundu.");
            dizi.find("Kasap").displayPersonal();
        }
        else{
            System.out.println("Personel bulunamadi.");
        }

        System.out.println("Ocak, Tozlu ve Kus siliniyor...");
        dizi.delete("Tozlu");
        dizi.delete("Ocak");
        dizi.delete("Kus");
        dizi.display();
    }
}
