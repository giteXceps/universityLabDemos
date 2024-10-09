public class ArrayApp {
    public static void main(String[] args) throws Exception {

        long[] dizi = new long[100];
        int elemanSayisi = 0;
        int j;
        int searchKey;

        // eleman ekleme
        dizi[0] = 77;
        dizi[1] = 55;
        dizi[2] = 66;
        dizi[3] = 23;
        dizi[4] = 22;
        dizi[5] = 45;
        dizi[6] = 88;
        dizi[7] = 99;
        dizi[8] = 15;
        dizi[9] = 44;

        elemanSayisi = 10;

        // elemanlarin yazdirilmasi
        for (j = 0; j < elemanSayisi; j++) {
            System.out.print(dizi[j] + " ");
        }
        System.out.println(" ");

        // eleman arama
        searchKey = 22;
        for (j = 0; j < elemanSayisi; j++) {
            if (dizi[j] == searchKey) {
                break;
            }
        }

        // silme
        for (int k = j; k < elemanSayisi; k++) {
            dizi[k] = dizi[k + 1];
        }
        elemanSayisi--;

        // guncel halini yazdir
        for (j = 0; j < elemanSayisi; j++) {
            System.out.print(dizi[j] + " ");
        }
        System.out.println(" ");

        System.out.println(dizi.length);
    }
}
