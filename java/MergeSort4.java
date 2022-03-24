import java.util.Arrays;

public class MergeSort4 {
    public static void main(String[] args) {
        int[] array = {10,80,91,90,70};

        // 원소를 반으로 나누는 함수
        mergeSortDevide(array,0,array.length-1);

        // merge된 최종 배열 출력
        outPutMergeArray(array);
    }


    private static void mergeSortDevide(int[] array,int left,int right) {
        //System.out.println("LEFT : " + left + " / RIGHT : " + right);

        if (left < right) {
            // 반으로 나누기 위한 변수
            int mid = (left+right)/2;
            
            
            // 앞(왼쪽) 부분 재귀 호출
            mergeSortDevide(array,left,mid);

            // 뒤(오른쪽) 부분 재귀 호출
            mergeSortDevide(array,mid+1,right);

            // 원소를 머지하는 함수
            merge(array,left,mid,right);
        }
    }

    private static void merge(int[] array,int left,int mid,int right) {
        int i = left;
        int j = mid + 1;
        int tempIndex = left;
        int[] temp = new int[array.length];

        while (i <= mid && j <= right) {
            if (array[i] < array[j]) {
                temp[tempIndex++] = array[i++];
            } else {
                temp[tempIndex++] = array[j++];
            }
        }

        // 앞(왼쪽)부분 배열에 원소가 남아있는 경우
        while (i <= mid) {
            temp[tempIndex++] = array[i++];
        }

        // 뒤(오른쪽)부분 배열에 원소가 남아있는 경우
        while (j <= right) {
            temp[tempIndex++] = array[j++];
        }

        for (int index=left;index<tempIndex;index++) {
            array[index] = temp[index];
        }
    }

    private static void outPutMergeArray(int[] array) {
        System.out.println(Arrays.toString(array));
        System.out.println();
    }
}
