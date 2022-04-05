import java.util.Arrays;

public class QuickSort3 {
    private static int partition(int[] array,int start,int end) {
        System.out.println("PARTITION START : " + start + " / END : " + end);
        
        int pivot = array[(start+end)/2];
        while (start <= end) {
            while (array[start] < pivot) {
                start++;
            }

            while (array[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }

        return start;
    }

    private static int[] quickSort(int[] array,int start,int end) {
        int partitionStart = partition(array,start,end);

        if (start < partitionStart-1) {
            quickSort(array,start,partitionStart-1);
        }

        if (partitionStart < end) {
            quickSort(array,partitionStart,end);
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {4,2,3,5,9};
        array = quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
