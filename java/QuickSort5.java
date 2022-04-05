import java.util.Arrays;

public class QuickSort5 {
    public static void main(String[] args) {
        int[] array = {1,10,5,8,7,6,4,3,2,9};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }


    public static void quickSort(int[] array,int left,int right) {
        int mid = (left+right)/2;
        threeSort(array,left,right,mid);

        int pivot,i,j;
        if (right-left+1 > 3) {
            pivot = array[mid];
            swap(array,mid,right-1);
            i = left;
            j = right - 1;

            while (true) {
                while (array[++i] < pivot);
                while (array[--j] > pivot);

                if (i >= j) {
                    break;
                }
                swap(array,i,j);
            }

            swap(array,i,right-1);

            quickSort(array,left,i-1);
            quickSort(array,i+1,right);
        }
    }


    public static void threeSort(int[] array,int left,int right,int mid) {
        if (array[left] >= array[mid]) {
            swap(array,left,mid);
        }

        if (array[left] >= array[right]) {
            swap(array,left,right);
        }

        if (array[mid] >= array[right]) {
            swap(array,mid,right);
        }
    }

    private static void swap(int[] array,int source,int target) {
        int temp = array[source];
        array[source] = array[target];
        array[target] = temp;
    }
}
