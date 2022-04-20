import java.util.Arrays;

public class HeapSort2 {
    static void swap(int[] array,int source,int target) {
        int temp = array[source];
        array[source] = array[target];
        array[target] = temp;
    }


    static void buildHeap(int[] array) {
        int end = array.length - 1;
        for (int i=end/2;i>0;i--) {
            heapify(array,i,end);
        }
    }


    static void heapify(int[] array,int parentIdx,int lastIdx) {
        int left = 2*parentIdx, right = 2*parentIdx+1;
        int larger;

        if (right <= lastIdx) {
            larger = (array[left] > array[right]) ? left : right;
        } else if (left <= lastIdx) {
            larger = left;
        } else {
            return;
        }

        if (array[larger] > array[parentIdx]) {
            swap(array,larger,parentIdx);
            heapify(array,larger,lastIdx);
        }
    }


    static void heapSort(int[] array) {
        buildHeap(array);
        System.out.printf("최대힙 구조 : %s \n", Arrays.toString(array));
        for (int end=array.length-1;end>=1;--end) {
            swap(array,0,end);
            heapify(array,0,end-1);
        }
    }


    public static void main(String[] args) {
        int[] array = {0,3,8,2,10,4,6,7,1,9,5};
        heapSort(array);
        System.out.printf("힙 소트 : %s \n",Arrays.toString(array));
    }
}
