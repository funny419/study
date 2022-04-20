import java.util.Arrays;

public class HeapSort4 {
    private void inPlaceHeapSort(int[] array) {
        for (int i=1;i<array.length-1;i++) {
            inPlaceHeapSortAdd(i,array);
        }

        for (int i=array.length-1;i>0;i--) {
            inPlaceHeapSortDelete(i,array);
        }

        print(array, "제자리 힙 정렬");
    }


    private int inPlaceHeapSortFind(int type,int idx,int refPoint) {
        switch (type) {
            // 부모 찾기
            case 0:
                if (idx == 0) {
                    return -1;
                }

                return (idx+1)/2 - 1;

            // 왼쪽 자식 찾기
            case 1:
                if ((idx+1)*2 - 1 >= refPoint) {
                    return -1;
                }

                return (idx+1)*2 - 1;

            // 오른쪽 자식 찾기
            case 2:
                if ((idx+1)*2 >= refPoint) {
                    return -1;
                }

                return (idx+1)*2;
        }

        return -1;
    }


    private void inPlaceHeapSortAdd(int refPoint,int[] array) {
        int me = refPoint;
        int parents = inPlaceHeapSortFind(0,me,refPoint);

        System.out.println("ADD Parents : " + parents);

        while (parents != -1) {
            if (array[me] > array[parents]) {
                swap(array,me,parents);
            } else {
                break;
            }

            me = parents;
            parents = inPlaceHeapSortFind(0,me,refPoint);
        }
    }

    private void inPlaceHeapSortDelete(int refPoint,int[] array) {
        swap(array,refPoint,0);

        int me = 0;
        int leftChild = inPlaceHeapSortFind(1,me,refPoint);
        int rightChild = inPlaceHeapSortFind(2,me,refPoint);

        while (leftChild != -1) {
            if (
                rightChild != -1 && array[me] < array[rightChild] &&
                array[leftChild] < array[rightChild]) {

                swap(array,me,rightChild);
                me = rightChild;
            }
            else if (array[me] < array[leftChild]) {
                swap(array,me,leftChild);
                me = leftChild;
            }
            else {
                break;
            }

            leftChild = inPlaceHeapSortFind(1,me,refPoint);
            rightChild = inPlaceHeapSortFind(2,me,refPoint);
        }
    }


    private void swap(int[] array,int source,int target) {
        int temp = array[source];
        array[source] = array[target];
        array[target] = temp;
    }


    private void print(int[] array,String sortName) {
        System.out.println(sortName + "로 정렬된 배열 : " + Arrays.toString(array));
    }


    public static void main(String[] args) {
        int[] array = {0, 3, 8, 2, 10, 4, 6, 7, 1, 9, 5};
        System.out.println("원래 배열 : " + Arrays.toString(array));

        HeapSort4 sort = new HeapSort4();
        sort.inPlaceHeapSort(array);
    }
}
