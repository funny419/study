public class InsertionSort {
    public static void insertionSort(int[] array) {
        insertionSort(array,array.length);
    }

    public static void insertionSort(int[] array,int size) {
        for (int i=1;i<size;i++) {
            int target = array[i];
            int j = i - 1; // 이전 정보

            while (target < array[j]) {
                array[j+1] = array[j];
            }

            array[j+1] = target;
        }
    }
}
