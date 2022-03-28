import java.util.Arrays;

public class InsertionSort2 {
    public static void main(String[] args) {
        int[] array = {10,20,6,4,3,7,5};

        for (int i=1;i<array.length;i++) {
            int standard = array[i]; // 기준 정보
            int aux = i - 1; // 비교 대상

            while (aux >= 0 && standard < array[aux]) {
                array[aux + 1] = array[aux];
                aux--;
            }
            
            array[aux + 1] = standard;
        }

        printArray(array);
    }


    public static void printArray(int[] array) {
        for (int item : array) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }
}
