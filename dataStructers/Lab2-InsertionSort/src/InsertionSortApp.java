public class InsertionSortApp {
    public static void main(String[] args) throws Exception {
        long[] dizi = new long[100];
        int elemanSayisi = 10;

        dizi[0] = 23;
        dizi[1] = 26;
        dizi[2] = 32;
        dizi[3] = 15;
        dizi[4] = 99;
        dizi[5] = 82;
        dizi[6] = 65;
        dizi[7] = 71;
        dizi[8] = 9;
        dizi[9] = 42;

        System.out.println(" Dizinin siralanmamis hali yazdiriliyor...");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(dizi[i] + " ");
        }

        // insertionsort
        for (int i = 1; i < elemanSayisi; i++) {
            long temp = dizi[i];
            int j = i;
            while (j > 0 && dizi[j - 1] > temp) {
                dizi[j] = dizi[j - 1];
                j--;
            }
            dizi[j] = temp;
        }

        System.out.println("\n Dizinin siralanmis hali yazdiriliyor...");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
}
