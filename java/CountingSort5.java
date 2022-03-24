import java.util.Arrays;

public class CountingSort5 {
    public static void main(String[] args) {
        int[] arr = {0,4,1,3,1,2,4,1};
        int maxValue = arr[0];
        for (int i=0;i<arr.length;i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }

        int[] counting = new int[maxValue+1];
        for (int i=0;i<arr.length;i++) {
            counting[arr[i]]++;
        }

        for (int i=1;i<counting.length;i++) {
            counting[i] += counting[i-1];
        }

        int[] result = new int[arr.length];
        for (int i=arr.length-1;i>=0;i--) {
            counting[arr[i]]--;
            result[counting[arr[i]]] = arr[i];
        }

        System.out.println(Arrays.toString(counting));
        System.out.println(Arrays.toString(result));
    }
}
