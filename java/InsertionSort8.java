import java.util.Arrays;

public class InsertionSort8 {
    public static void main(String[] args) {
        int[] arr = {8,2,1,4,5};

        if (arr.length > 1) {
            int i,j;
            for (i=1;i<arr.length;i++) {
                int tmp = arr[i];
                for (j=i-1;j>=0 && tmp < arr[j];j--) {
                    arr[j+1] = arr[j];
                }

                arr[j+1] = tmp;
            }

            System.out.println(Arrays.toString(arr));
        }
    }
}
