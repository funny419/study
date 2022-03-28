import java.util.Arrays;

public class InsertionSort9 {
    public static void main(String[] args) {
        int[] array = {9,7,1,8,10,2};
        for (int i=1;i<array.length;i++) {
            int standardValue = array[i];
            int compareIndex = i - 1;
            while (compareIndex >= 0 && standardValue < array[compareIndex]) {
                array[compareIndex+1] = array[compareIndex];
                compareIndex--;
            }

            array[compareIndex+1] = standardValue;
        }

        System.out.println(Arrays.toString(array));
    }
}
