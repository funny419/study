import java.util.Arrays;

public class QuickSort4 {
    private static int[] data = {1,10,5,8,7};
    private static int number = 5;

    public static void quickSort(int[] array,int start,int end) {
        if (start >= end) {
            return;
        }

        System.out.println("START : " + start + " / END : " + end);

        int pivot = start;
        int i = start + 1;
        int j = end;
        int temp;

        // 엇갈릴 때 까지 반복 j가 i보다 크거나 같으면 while문 종료
        while (i <= j) {
            // pivot 값보다 큰 값을 만날 때 까지
            while (i <= end && array[i] < array[pivot]) {
                i++;
            }

            System.out.println("WHILE I : " + i);

            // pivot 값보다 작은 값을 만날 때 까지
            while (j > start && array[j] >= array[pivot]) {
                j--;
            }

            System.out.println("WHILE J : " + j);

            // 현재 엇갈린 상태라면
            if (i > j) {
                temp = array[j];
                array[j] = array[pivot];
                array[pivot] = temp;
            } else {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

            quickSort(array,start,j-1);
            quickSort(array,j+1,end);
        }
    }

    public static void main(String[] args) {
        quickSort(data,0,number-1);
        System.out.println(Arrays.toString(data));
    }
}
