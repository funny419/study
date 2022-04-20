public class HeapSortBottomUp {
    public static void sort(int[] array) {
        sort(array,array.length);
    }


    private static void sort(int[] array,int size) {
        if (size < 2) {
            return;
        }

        int parentIdx = getParent(size-1);

        for (int i=parentIdx;i>0;i--) {

        }
    }


    private static int getParent(int child) {
        return (child - 1) / 2;
    }


    private static void swap(int[] array,int source,int target) {
        int temp = array[source];
        array[source] = array[target];
        array[target] = temp;
    }


    private static void heapify(int[] array,int parentIdx,int lastIdx) {
        int leftChildIdx;
        int rightChildIdx;
        int largestIdx;

        /**
         * 현재 부모 인덱스의 자식 노드 인덱스가 마지막 인덱스를 넘지 않을 때 까지 반복한다.
         *
         * 이때 왼쪽 자식 노드를 기준으로 해야 한다.
         * 오른쪽 자식 노드를 기준으로 범위를 검사하게 되면 마지막 부모 인덱스가 왼쪽 자식만 갖고 있을 경우
         * 왼쪽 자식노드와는 비교 및 교환을 할 수 없기 때문이다.
         */
        while ((parentIdx*2) + 1 <= lastIdx) {
            leftChildIdx = (parentIdx * 2) + 1;
            rightChildIdx = (parentIdx * 2) + 2;
            largestIdx = parentIdx;

            if (array[leftChildIdx] > array[largestIdx]) {
                largestIdx = leftChildIdx;
            }

            if (rightChildIdx <= lastIdx && array[rightChildIdx] > array[largestIdx]) {
                largestIdx = rightChildIdx;
            }

            if (largestIdx != parentIdx) {
                swap(array,parentIdx,largestIdx);
                parentIdx = largestIdx;
            } else {
                return;
            }
        }
    }
}
