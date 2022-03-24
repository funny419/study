import java.util.Arrays;
import java.util.Random;

public class CountingSort2 {
    static final int N = 10;

    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[N];
        for (int i=0;i<N;i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("정렬 전 : " + Arrays.toString(array));
        countingSort(array);
        System.out.println("정렬 후 : " + Arrays.toString(array));
    }

    private static void countingSort(int[] array) {
        int max = array[0];
        for (int i=1;i<array.length;i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        int[] counting = new int[max+1];
        for (int i=0;i<N;i++) {
            counting[array[i]]++;
        }

        System.out.println("Counting Length : " + counting.length);

        int index = 0;
        for (int i=0;i<counting.length;i++) {
            while (counting[i]-- > 0) {
                System.out.println("Counting["+i+"] : " + counting[i]);
                array[index++] = i;
            }
        }
    }
}
