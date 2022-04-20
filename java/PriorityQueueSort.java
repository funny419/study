import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueSort {
    private void heapSort(int[] array) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i=0;i<array.length;i++) {
            queue.add(array[i]);
        }

        int i = 0;
        while (!queue.isEmpty()) {
            array[i] = queue.poll();
            i++;
        }

        print(array,"우선순위 큐를 사용한 힙 정렬");
    }


    private void print(int[] array,String sortName) {
        System.out.println(sortName + "로 정렬된 배열 : " + Arrays.toString(array));
    }


    public static void main(String[] args) {
        int[] array = {0,3,8,2,10,4,6,7,1,9,5};
        System.out.println("원래 배열 : " + Arrays.toString(array));

        PriorityQueueSort sort = new PriorityQueueSort();
        sort.heapSort(array);
    }
}
