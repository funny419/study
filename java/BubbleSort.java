import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        bubbleSort(array,array.length);
    }

    public static void bubbleSort(int[] array, int size) {
        for (int i=1;i<size;i++) {
            for (int j=0;j<size-1-i;j++) {
                if (array[j] > array[j+1]) {
                    swap(array,j,j+1);
                }
            }
        }
    }

    private static void swap(int[] array,int source,int target) {
        int temp = array[source];
        array[source] = array[target];
        array[target] = temp;
    }


    public static void main(String[] args) {
        int[] array = {9,5,3,7,8,1,4};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    } 
}