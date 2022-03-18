import java.util.Arrays;

public class InsertionSort4 {
    public static void main(String[] args) {
        int A[] = {66,10,1,34,5};
        
        int size = A.length;
        int temp = 0;
        int j = 0;
        for (int i=1;i<size;i++) {
            temp = A[i];
            for (j=i-1;j>=0 && temp < A[j];j--) {
                A[j+1] = A[j];
            }

            System.out.println(j);

            A[j+1] = temp;
        }

        System.out.println(Arrays.toString(A));
    }
}
