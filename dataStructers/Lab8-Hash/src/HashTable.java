public class HashTable {
    private DataItem[] hashArray;
    private int arraySize;
    private DataItem nonItem;
    private int elemanSayisi = 0;

    public HashTable(int size) {
        arraySize = size;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1);
    }

    public void displayTable() {
        System.out.println("Tablo");
        for (int i = 0; i < arraySize; i++) {
            if (hashArray[i] != null) {
                System.out.println(hashArray[i].getKey() + " ");
            } else {
                System.out.println("** ");

            }
        }
        System.out.println("");
    }

    public int hashFunction(int key) {
        return key % arraySize; // % mod alır
    }

    public void insert(DataItem item) {
        boyutkontrol();
        int key = item.getKey();
        int hashVal = hashFunction(key);

        while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
            ++hashVal;
            hashVal %= arraySize;

        }
        hashArray[hashVal] = item;
        elemanSayisi++;

    }

    public void boyutkontrol() {
        int hashVal;
        int tempElemanSayisi = 0;

        if (elemanSayisi >= (arraySize * 2 / 3)) {
            int tempSize = asalGetir(arraySize * 2);
            DataItem[] tempHash = new DataItem[tempSize];
            for (int i = 0; i < arraySize; i++) {
                if (hashArray[i] != null && hashArray[i].getKey() != -1) {
                    hashVal = hashArray[i].getKey() % tempSize;
                    while (tempHash[hashVal] != null && tempHash[hashVal].getKey() != -1) {
                        ++hashVal;
                        hashVal %= tempSize;
                    } // end while
                    tempHash[hashVal] = hashArray[i];
                    tempElemanSayisi++;

                } // end if
            } // end for
            hashArray = tempHash;
            elemanSayisi = tempElemanSayisi;
            arraySize = tempSize;
        } // if rehasing
    }

    private int asalGetir(int min) {
        for (int j = min; true; j++) {
            if (asalMi(j)) {
                return j;

            }
        }
    }

    private boolean asalMi(int n) {
        for (int j = 2; (j * j <= n); j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

    public DataItem delete(int key) {
        int hashVal = hashFunction(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) { // aranan değer ile eşleştirme
                DataItem temp = hashArray[hashVal];
                hashArray[hashVal] = nonItem;
                return temp;
            }
            // Linear probing +1 -> yan indise bak demek
            // bir sonraki konuma geç
            ++hashVal;
            // dizinin boyutunu aşmamak için mod al
            hashVal %= arraySize;
            // arraysize e göre mod olarak gezecek buraya kadar
        }
        // anahtar bulunamadıysa
        return null;
    }

    public DataItem find(int key) {
        int hashVal = hashFunction(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) { // aranan değer ile eşleştirme
                return hashArray[hashVal];
            }
            // Linear probing +1 -> yan indise bak demek
            // bir sonraki konuma geç
            ++hashVal;
            // dizinin boyutunu aşmamak için mod al
            hashVal %= arraySize;
            // arraysize e göre mod olarak gezecek buraya kadar
        }
        // anahtar bulunamadıysa
        return null;

    }
}