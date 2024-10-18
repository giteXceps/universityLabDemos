import java.util.Random;

public class SortMethods {

    Random rand = new Random();

    public void createRandArray(long[] array, int n) {
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(100);
        }
    }

    public void displayArray(long[] array, int n) {
        System.out.println(" Dizi yazdiriliyor");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void bubbleSort(long[] array, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    long temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("\n Dizi bubbleSort methodu ile siralandi");
    }

    public void selectionSort(long[] array, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                long temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        System.out.println("\n Dizi selectionSort methodu ile siralandi");
    }

    public void insertionSort(long[] array, int n){
        for(int i = 1; i<n;i++){
            long temp = array[i];
            int j = i;
            while (j>0 && array[j-1]>temp){
                array[j] = array[j-1];
                j--;
            }
            array[j]=temp;
        }
        System.out.println("\n Dizi insertionSort methodu ile siralandi");
    }

}
