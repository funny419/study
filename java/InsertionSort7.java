import java.util.Arrays;

public class InsertionSort7 {
    public static void main(String[] args) {
        int[] a = {1,10,5,7,22,3,0};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void insertionSort(int[] array) {
        int i,temp;
        int j = 0;
        for (i=1;i<array.length;i++) {
            temp = array[i];
            for (j=i-1;j>=0 && temp < array[j]; j--) {
                array[j+1] = array[j];
            }

            array[j+1] = temp;
        }
    }
}