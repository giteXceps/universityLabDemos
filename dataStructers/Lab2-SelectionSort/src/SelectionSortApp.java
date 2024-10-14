public class SelectionSortApp {
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

        // selectionsort
        for (int i = 0; i < elemanSayisi - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < elemanSayisi; j++) {
                if (dizi[j] < dizi[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != 1) {
                long temp = dizi[i];
                dizi[i] = dizi[minIndex];
                dizi[minIndex] = temp;
            }
        }

        System.out.println("\n Dizinin siralanmis hali yazdiriliyor...");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
}
