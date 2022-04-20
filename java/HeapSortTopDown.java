public class HeapSortTopDown {
    public static void sort(int[] array) {
        sort(array,array.length);
    }


    private static void sort(int[] array,int size) {
        /**
         * 부모노드와 heaify과정에서 음수가 발생하면 잘못 된 참조가 발생하기 때문에
         * 원소가 1개이거나 0개일 경우 정렬 할 필요가 없으므로 바로 함수를 종료한다.
         */
        if (size < 2) {
            return;
        }

        // 가장 마지막 요소의 부모 인덱스
        int parentIdx = getParent(size-1);

        for (int i=parentIdx;i>=0;i--) {

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
        /**
         * 현재 트리에서 부모 노드의 자식노드 인덱스를 각각 구해준다.
         * 현재 부모 인덱스가 가장 큰 값을 갖고 있다고 가정한다.
         */
        int leftChildIdx = 2 * parentIdx + 1;
        int rightChildIdx = 2 * parentIdx + 2;
        int largestIdx = parentIdx;

        /**
         * left child node와 비교
         *
         * 자식노드 인덱스가 트리의 크기를 넘어가지 않으면서
         * 현재 가장 큰 인덱스보다 왼쪽 자식노드의 값이 더 클 경우
         * 가장 큰 인덱스를 가리키는 largestIdx를 leftChildIdx로 바꾸어 준다.
         */
        if (leftChildIdx <= lastIdx && array[largestIdx] < array[leftChildIdx]) {
            largestIdx = leftChildIdx;
        }

        /**
         * left right node와 비교
         *
         * 자식노드 인덱스가 트리의 크기를 넘어가지 않으면서
         * 현재 가장 큰 인덱스보다 오른쪽 자식노드의 값이 더 클 경우
         * 가장 큰 인덱스를 가리키는 largestIdx를 rightChildIdx로 바꾸어 준다.
         */
        if (rightChildIdx <= lastIdx && array[largestIdx] < array[rightChildIdx]) {
            largestIdx = rightChildIdx;
        }

        /**
         * largestIdx와 부모노드가 같지 않다는것은
         * 위 자식노드 비교 과정에서 현재 부모노드보다 큰 노드가 존재한다는 뜻이다.
         * 그럴 경우 해당 자식 노드와 부모노드를 교환해주고,
         * 교환 된 자식노드를 부모노드로 삼은 서브트리를 검사하도록 재귀 호출 한다.
         */
        if (parentIdx != largestIdx) {
            swap(array,largestIdx,parentIdx);
            heapify(array,largestIdx,lastIdx);
        }
    }
}
