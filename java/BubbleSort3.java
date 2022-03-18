public class BubbleSort3 {
    public static void main(String[] args) {
        int[] array = {30, 5, 21, 10, 4, 13, 8, 25, 19, 1};
        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array.length-1-i;j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int item : array) {
            System.out.printf("%d ",item);
        }
    }
}
