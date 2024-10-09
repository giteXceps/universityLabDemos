public class HighArray {
    private long[] dizi;
    private int elemanSayisi;

    public HighArray(int max) {
        dizi = new long[max];
        elemanSayisi = 0;
    }

    // eleman bulma
    public boolean find(long searchKey) {
        int i;
        for (i = 0; i < elemanSayisi; i++) {
            if (dizi[i] == searchKey) {
                break;
            }
        }
        if (i == elemanSayisi) {
            return false;
        }
        return true;
    }

    // eleman ekleme
    public void insert(long value) {
        dizi[elemanSayisi] = value;
        elemanSayisi++;
    }

    // eleman silme
    public boolean delete(long value) {
        int i;
        for (i = 0; i < elemanSayisi; i++) {
            if (dizi[i] == value)
                break;
        }
        if (i == elemanSayisi)
            return false;

        else {
            for (int j = i; j < elemanSayisi; j++) {
                dizi[j] = dizi[j + 1];
            }
            elemanSayisi--;
            return true;
        }
    }

    // ekrana yazdırma
    public void display() {
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println("");
    }

}
