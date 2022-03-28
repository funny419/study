import java.util.Arrays;


public class SelectionSort2 {
    public static void main(String[] args) {
        int[] a = {3,5,1,2,4};
        int tempValue, tempJ = 0;
        for (int i=0;i<a.length;i++) {
            int min = Integer.MAX_VALUE;

            for (int j=i;j<a.length;j++) {
                if (a[j] < min) {
                    min = a[j];
                    tempJ = j;
                }
            }

            tempValue = a[i];
            a[i] = a[tempJ];
            a[tempJ] = tempValue;
        }

        System.out.println(Arrays.toString(a));
    } 
}