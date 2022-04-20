import java.util.ArrayList;
import java.util.Collections;

public class HeapSort3 {
    private ArrayList<Integer> heapArray;

    HeapSort3() {
        heapArray = new ArrayList<>();
    }


    // 부모 노드 인덱스 찾기
    private int getParents(int idx) {
        // 루트 노드의 부모는 없음
        if (idx == 0) {
            return -1;
        }

        int index = idx + 1;
        return index/2 - 1;
    }

    // 왼쪽 자식 노드 인덱스 찾기
    private int getLeftChild(int idx) {
        int index = idx + 1;
        if (index*2-1 > heapArray.size() - 1) {
            return -1;
        }

        return index*2 - 1;
    }

    // 오른쪽 자식 노드 인덱스 찾기
    private int getRightChild(int idx) {
        int index = idx + 1;
        if (index*2 > heapArray.size() - 1) {
            return -1;
        }

        return index*2;
    }

    // heap 추가
    private void add(int num) {
        heapArray.add(num); // 우선 맨 끝에 삽입

        int me = heapArray.size() - 1;
        int parents = this.getParents(me);

        while (parents != -1) {
            if (heapArray.get(me) > heapArray.get(parents)) {
                Collections.swap(heapArray,me,parents);
            } else {
                break;
            }

            me = parents;
            parents = this.getParents(me);
        }
    }

    private int delete() {
        Collections.swap(heapArray,0,heapArray.size()-1);
        int delete = heapArray.remove(heapArray.size()-1);

        int me = 0;
        int leftChild = this.getLeftChild(me);
        int rightChild = this.getRightChild(me);

        // 자식이 leftChild부터 채워지므로, leftChild가 없는 경우에는 rightChild도 없지만
        // rightChild가 없는 경우에도 leftChild는 있을수 있다.

        // heal 재정렬
        // leftChild가 없을경우 즉 모든 자식이 없을 경우에만 종료
        while (leftChild != -1) {
            // rightChild가 있고, 내가 자식보다 크고, rightChild가 자식들 중에 가장 작은 값일 경우에만
            // rightChild와 me 교환
            if (rightChild != -1 && heapArray.get(me) > heapArray.get(rightChild)) {
                Collections.swap(heapArray,me,rightChild);
                me = rightChild;
            }
            else if (heapArray.get(me) > heapArray.get(leftChild)) {
                Collections.swap(heapArray,me,leftChild);
                me = leftChild;
            }
            else {
                break;
            }

            leftChild = getLeftChild(me);
            rightChild = getRightChild(me);
        }

        return delete;
    }

    private boolean isEmpty() {
        return heapArray.size() == 0;
    }


    public static void main(String[] args) {

    }
}
