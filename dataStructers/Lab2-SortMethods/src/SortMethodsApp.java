public class SortMethodsApp {
    public static void main(String[] args) throws Exception {
        long[] dizi = new long[100];
        int elemanSayisi = 10;
        SortMethods sortMethods = new SortMethods();

        // boublesort
        sortMethods.createRandArray(dizi, elemanSayisi);
        System.out.println("Rastgele bir dizi olusturuldu");
        sortMethods.displayArray(dizi, elemanSayisi);
        sortMethods.bubbleSort(dizi, elemanSayisi);
        sortMethods.displayArray(dizi, elemanSayisi);
        

        //selectionSort
        sortMethods.createRandArray(dizi, elemanSayisi);
        System.out.println("\n-------------------------------------");
        System.out.println("Rastgele bir dizi olusturuldu");
        sortMethods.displayArray(dizi, elemanSayisi);
        sortMethods.selectionSort(dizi, elemanSayisi);
        sortMethods.displayArray(dizi, elemanSayisi);

        //insertionSort
        sortMethods.createRandArray(dizi, elemanSayisi);
        System.out.println("\n-------------------------------------");
        System.out.println("Rastgele bir dizi olusturuldu");
        sortMethods.displayArray(dizi, elemanSayisi);
        sortMethods.insertionSort(dizi, elemanSayisi);
        sortMethods.displayArray(dizi, elemanSayisi);
    }
}

