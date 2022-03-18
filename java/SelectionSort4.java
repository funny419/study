import java.util.Arrays;


public class SelectionSort4 {
    public static void main(String[] args) {
        int[] arr = {9,4,1,7,3,2,1};
    
        int len = arr.length;
        int min = 0;
        int temp = 0;

        for (int i=0;i<len;i++) {
            min = i;
            for (int j=i+1;j<len;j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

            System.out.println(Arrays.toString(arr) + " - " + (i+1));
        }
    }
}
