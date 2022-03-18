import java.util.Arrays;

public class InsertSort3 {
    public static void main(String[] args) {
        int[] array = {10,20,6,4,3,7,5};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int end=1;end<array.length;end++) {
            for (int i=end;i>0;i--) {
                if (array[i-1] > array[i]) {
                    swap(array,i-1,i);
                }
            }
        }
    }

    private static void swap(int[] array,int source,int target) {
        int tmp = array[source];
        array[source] = array[target];
        array[target] = tmp;
    }
}
