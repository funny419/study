public class SelectionSort5 {
    public static void selectionSort5(int[] array) {
        for (int i=0;i<array.length;i++) {
            int minIndex = i;
            for (int j=i+1;j<array.length;j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            swap(array,minIndex,i);
        }
    }
    
    private static void swap(int[] array,int source,int target) {
        int temp = array[source];
        array[source] = array[target];
        array[target] = temp;
    }

    private static void printArray(int[] array) {
        for (int data: array) {
            System.out.println(data + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] item = new int[] {5,1,3,7,2,9};
        System.out.println("선택 정렬 전 : ");
        printArray(item);
        System.out.println("선택 정렬 후 : ");
        selectionSort5(item);
        printArray(item);
    }
}
