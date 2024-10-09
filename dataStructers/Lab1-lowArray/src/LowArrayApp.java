public class LowArrayApp {
    public static void main(String[] args) throws Exception {
        LowArray dizi;
        dizi = new LowArray(100);
        int elemanSayisi = 0;
        int j;

        dizi.setElem(0, 10);
        dizi.setElem(1, 20);
        dizi.setElem(2, 30);
        dizi.setElem(3, 45);
        dizi.setElem(4, 50);
        dizi.setElem(5, 26);
        dizi.setElem(6, 35);
        dizi.setElem(7, 5);
        dizi.setElem(8, 23);
        dizi.setElem(9, 24);

        elemanSayisi = 10;

        // listeleme
        for (j = 0; j < elemanSayisi; j++) {
            System.out.print(dizi.getElem(j) + " ");
        }
        System.out.println("");

        // Arama
        int searchKey = 26;
        for (j = 0; j < elemanSayisi; j++) {
            if (dizi.getElem(j) == searchKey) {
                break;
            }
        }

        if (j == elemanSayisi) {
            System.out.println(searchKey + " bulunamadi");
        } else {
            System.out.println(searchKey + " bulundu");
        }

        // Silme
        for (j = 0; j < elemanSayisi; j++) {
            if (dizi.getElem(j) == 55) {
                break;
            }
        }
        for (int k = j; k < elemanSayisi; k++) {
            dizi.setElem(k, dizi.getElem(k + 1));
        }
        elemanSayisi--;

        // guncel hal yazdirma
        for (j = 0; j < elemanSayisi; j++) {
            System.out.print(dizi.getElem(j) + " ");
        }
        System.out.println("");
    }
}
