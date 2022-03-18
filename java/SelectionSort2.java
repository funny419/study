import java.util.Arrays;


public class SelectionSort2 {
    public static void main(String[] args) {
        int[] a = {3,5,1,2,4};
        int tempValue, tempJ = 0;
        for (int i=0;i<a.length;i++) {
            int min = Integer.MAX_VALUE;
            System.out.println("i : " + i +" / MIN : " + min);

            for (int j=i;j<a.length;j++) {
                System.out.println("j : " + j + " / a[" + j + "] : " + a[j]);
                if (a[j] < min) {
                    min = a[j];
                    tempJ = j;
                }

                System.out.println("j : " + j + " / min : " + min + " / tempJ : " + tempJ);
            }

            tempValue = a[i];
            a[i] = a[tempJ];
            a[tempJ] = tempValue;
            
            System.out.println("a[" + i + "] / tempValue : " + tempValue);
            System.out.println("i LOOP END A LIST : " + Arrays.toString(a));
        }

        System.out.println(Arrays.toString(a));
    } 
}