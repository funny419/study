import java.util.Arrays;

public class InsertionSort6 {
    public static void main(String[] args) {
        int[] array = {3, 1, 2, 6, 7 , 5, 4};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void insertSort(int[] array) {
        // 1부터 시작하는것을 꼭 유념해야 한다.
        for (int i=1;i<array.length;i++) {
            int index = i;
            int tmp = array[i];
            
            while ((index > 0) && (array[index-1] > tmp)) {
                array[index] = array[index-1];
                index--;
            }

            array[index] = tmp;
        }
    }
}
