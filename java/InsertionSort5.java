import java.util.Arrays;

public class InsertionSort5 {
    public static void main(String[] args) {
        int[] a = {254,3,213,64,75,56,4,324,65,78,9,5,76,3410,8,342,76};
        int standard,j;
        for (int i=1;i<a.length;i++) {
            standard = a[i];
            for (j=i-1;j>=0 && a[j] > standard;j--) {
                a[j+1] = a[j];
            } 

            a[j+1] = standard;
        }

        System.out.println(Arrays.toString(a));
    }
}
