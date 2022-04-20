public class HeapSort5 {
    static void heapSort(int[] array) {
        int n = array.length;
        for (int i=n/2-1;i>=0;i--) {
            heapify(array,n,i);
        }

        for (int i=n-1;i>0;i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array,i,0);
        }
    }


    static void heapify(int[] array,int n,int i) {
        int p = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;

        if (l < n && array[p] < array[l]) {
            p = l;
        }

        if (r < n && array[p] < array[r]) {
            p = r;
        }

        if (i != p) {
            int temp = array[p];
            array[p] = array[i];
            array[i] = temp;

            heapify(array,n,p);
        }
    }
}
