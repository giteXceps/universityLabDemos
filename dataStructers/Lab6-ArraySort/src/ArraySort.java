public class ArraySort {
    private long[] dizi;
    private int elemanSayisi;

    public ArraySort(int max) {
        dizi = new long[max];
        elemanSayisi = 0;
    }

    public void insert(long d) {
        dizi[elemanSayisi] = d;
        elemanSayisi++;
    }

    public void display() {
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println();
    }

    // merge sort
    public void mergeSort() {
        long[] workSpace = new long[elemanSayisi];
        recMergeSort(workSpace, 0, elemanSayisi - 1);
    }

    private void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;
            // ilk yariyi siralama
            recMergeSort(workSpace, lowerBound, mid);
            // son yariyi sirala
            recMergeSort(workSpace, mid + 1, upperBound);
            // iki yariyi birlestir
            merge(workSpace, lowerBound, mid + 1, upperBound);
        }
    }

    // siralanmis parcalari birlestir
    private void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound) {
        int i = 0;
        int lowerBound = lowPtr;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1;

        // iki yarida eleman kalmasini kontrol eder
        while (lowPtr <= mid && highPtr <= upperBound) {
            if (dizi[lowPtr] < dizi[highPtr]) {
                workSpace[i++] = dizi[lowPtr++];
            } else {
                workSpace[i++] = dizi[highPtr++];
            }
        }

        while (lowPtr <= mid) {
            workSpace[i++] = dizi[lowPtr++];
        }

        while (highPtr <= mid) {
            workSpace[i++] = dizi[highPtr++];
        }

        // siralanmislari birlestir
        for (int j = 0; j < n; j++) {
            dizi[lowerBound + j] = workSpace[j];
        }
    }

    // QUICK SORT

    public void quickSort() {
        recQuickSort(0, elemanSayisi);
    }

    private void recQuickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            long pivot = dizi[right];
            int partition = patitionIt(left, right, pivot);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }

    }

    // diziyi pivot etrafında ikiye ayirir pivotun dogru konumunu belirler
    private int patitionIt(int left, int right, long pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;

        while(true){
            while (dizi[++leftPtr] < pivot);

            while(rightPtr >0 && dizi[--rightPtr] > pivot);

            if(leftPtr >= rightPtr){
                break;
            }
            else{
                swap(leftPtr, rightPtr);
            }
        }
        return leftPtr;
    }

    private void swap(int index1, int index2) {
        long temp = dizi[index1];
        dizi[index1] = dizi[index2];
        dizi[index2] = temp;
    }
}
