public class orderedArray {
    private long[] dizi;
    private int elemanSayisi;

    public orderedArray(int max) {
        dizi = new long[max];
        elemanSayisi = 0;
    }

    public int size() {
        return elemanSayisi;
    }

    // dizide eleman arama binary search
    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = elemanSayisi - 1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (dizi[curIn] == searchKey) // eleman bulunursa
                return curIn;
            else if (lowerBound > upperBound) // eleman bulunmazsa eleman sayisini dondurur
                return elemanSayisi;
            else {
                if (dizi[curIn] < searchKey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }

    // diziye eleman yerlestirme
    public void insert(long value) {
        int j;
        for (j = 0; j < elemanSayisi; j++) {
            if (value < dizi[j]) {
                break;
            }
        }

        for (int k = elemanSayisi; k > j; k--) {
            dizi[k] = dizi[k - 1];
        }

        dizi[j] = value;
        elemanSayisi++;
    }

    // diziden eleman silme
    public boolean delete(long value) {
        int j = find(value);
        if (j == elemanSayisi)
            return false;
        else {
            for (int k = j; k < elemanSayisi; k++) {
                dizi[k] = dizi[k + 1];
            }
            elemanSayisi--;
            return true;
        }
    }

    // diziyi sira ile yazdirma
    public void display() {
        for (int j = 0; j < elemanSayisi; j++) {
            System.out.print(dizi[j] + " ");
            System.out.print("");
        }
        System.out.println();
    }
}
