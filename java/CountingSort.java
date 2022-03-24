import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] array = new int[20];
        int[] counting = new int[11];
        int[] result = new int[20];

        for (int i=0;i<array.length;i++) {
            array[i] = (int)(Math.random()*11);
        }

        // Counting Sort
        // Step 1
        for (int i=0;i<array.length;i++) {
            counting[array[i]]++;
        }

        // Step 2
        for (int i=1;i<counting.length;i++) {
            counting[i] += counting[i-1];
        }

        // Step 3
        for (int i=array.length-1;i>=0;i--) {
            int value = array[i];
            counting[value]--;
            result[counting[value]] = value;
        }

        System.out.println("Result[]");
        System.out.println(Arrays.toString(result));
    }
}
