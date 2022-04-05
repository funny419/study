import java.util.Arrays;

public class QuickSort {
    private static void quickSort(int[] array,int start,int end) {
        int part = partition(array,start,end);
        if (start < part-1) {
            quickSort(array,start,part-1);
        }
        
        if (end > part) {
            quickSort(array,part,end);
        }
    }

    private static int partition(int[] array,int start,int end) {
        int pivot = array[(start+end)/2];
        while (start <= end) {
            while (array[start]<pivot) {
                start++;
            }

            while (array[end]>pivot) {
                end--;
            }

            if (start <= end) {
                swap(array,start,end);
                start++;
                end--;
            }
        }

        return start;
    }

    private static void swap(int[] array,int start,int end) {
        int tmp = array[start];
        array[start] = array[end];
        array[end] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {4,2,3,5,9};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
