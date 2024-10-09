public class App {
    public static void main(String[] args) throws Exception {
        Pasta pastaTarifi = new Pasta("Cikolatali Pasta", 60, 8, "Kek", "Un, seker, kakao, yumurta, sivi yag, sut, vanilya, cikolata");
        System.out.println("Pasta tarifi: ");
        System.out.println("Yemek adi: " + pastaTarifi.getYemekAdi());
        System.out.println("Tatli Turu: " + pastaTarifi.getTatliTur());
        System.out.println("Malzemeler: " + pastaTarifi.getMalzemeler());
        System.out.println("Pisirme Süresi: " + pastaTarifi.getPisirmeSuresi() + " dakika");
        System.out.println("Kisi Sayisi: " + pastaTarifi.getKisiSayisi());
        pastaTarifi.hazirla();
        pastaTarifi.cirpma();
        pastaTarifi.pisir();
        pastaTarifi.servisYap();
        System.out.println();

        Kebap kebapTarifi = new Kebap("Adana Kebap", 30, 4, "Kuzu Eti", "Biber, domaates");
        System.out.println("Kebap Tarifi: ");
        System.out.println("Yemek Adi: " + kebapTarifi.getYemekAdi());
        System.out.println("Et Turu: " + kebapTarifi.getEtTur());
        System.out.println("Sebze Turu: " + kebapTarifi.getSebzeTur());
        System.out.println("Pisirme Suresi: " + kebapTarifi.getPisirmeSuresi() + " dakika");
        System.out.println("Kisi Sayisi: " + kebapTarifi.getKisiSayisi());
        kebapTarifi.dogra();
        kebapTarifi.hazirla();
        kebapTarifi.pisir();
        kebapTarifi.servisYap();
    }
}
