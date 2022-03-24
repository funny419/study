import java.util.Arrays;

public class MergeSort3 {
    // 합치는 과정에서 정렬하여 원소를 담을 임시 배열
    private static int[] sorted;


    public static void main(String[] args) {
        int[] array = {8,2,6,4,7,3,9,5};
        
        //System.out.println("<정렬 전>");
        //System.out.println(Arrays.toString(array));
        mergeSort(array);
        
        //System.out.println("<정렬 후>");
        //System.out.println(Arrays.toString(array));
    }


    public static void mergeSort(int[] array) {
        sorted = new int[array.length];
        mergeSort(array,0,array.length-1);
        sorted = null;
    }

    // Top-Down 방식 구현
    private static void mergeSort(int[] array,int left,int right) {
        if (left == right) {
            return;
        }

        // 중간 위치
        int mid = (left+right)/2;
        System.out.println("left : " + left + " / right : " + right + " / mid : " + mid);
        
        // 절반 중 왼쪽 부분 리스트
        mergeSort(array,left,mid);

        // 절반 중 오른쪽 부분 리스트
        mergeSort(array,mid+1,right);

        // 병합작업
        merge(array,left,mid,right);
    }


    /**
     * 배열 병합 처리
     * 
     * @param array
     * @param left
     * @param mid
     * @param right
     */
    private static void merge(int[] array,int left,int mid,int right) {
        System.out.println(Arrays.toString(array) + " left : " + left + " mid : " + mid + " right : " + right);

        // 왼쪽 부분리스트 시작점
        int l = left;

        // 오른쪽 부분리스트 시작점
        int r = mid + 1;

        // 채워넣을 배열의 인덱스
        int idx = left;

        while (l <= mid && r <= right) {
            /**
             * 왼쪽 부분리스트 l번째 원소가 오른쪽 부분리스트 r번째 원소보다 작거나 같을 경우
             * 왼쪽에 l번째 원소를 새 배열에 넣고 l과 idx를 1 증가 시킨다.
             */
            if (array[l] <= array[r]) {
                sorted[idx] = array[l];
                idx++;
                l++;
            }
            /**
             * 오른쪽 부분리스트 r번째 원소가 왼쪽 부분리스트 l번째 원소보다 작거나 같을 경우
             * 오른쪽의 r번째 원소를 새 배열에 넣고 r과 idx를 1 증가 시킨다.
             */
            else {
                sorted[idx] = array[r];
                idx++;
                r++;
            }
        }

        /**
         * 왼쪽 부분리스트가 먼저 모두 새 배열에 채워졌으나 오른쪽 부분리스트 원소가 아직 남아있을 경우
         * 오른쪽 부분리스트의 나머지 원소들을 새 배열에 채워준다.
         * 
         */
        if (l > mid) {
            while (r <= right) {
                sorted[idx] = array[r];
                idx++;
                r++;
            }
        }
        /**
         * 오른쪽 부분 리스트가 먼저 모두 새 배열에 채워졌으나 왼쪽 부분리스트 원소가 아직 남아있을 경우
         * 왼쪽 부분리스트의 나머지 원소들을 새 배열에 채워준다.
         */
        else {
            while (l <= mid) {
                sorted[idx] = array[l];
                idx++;
                l++;
            }
        }

        // 정렬된 새 배열을 기존의 배열에 복사하여 옮겨준다.
        for (int i=left;i<=right;i++) {
            array[i] = sorted[i];
        }
    }
}
