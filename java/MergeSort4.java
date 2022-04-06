import java.util.Arrays;

public class MergeSort4 {
    public static void main(String[] args) {
        int[] array = {10,80,91,90,70,60};

        // 원소를 반으로 나누는 함수
        mergeSortDevide(array,0,array.length-1,"FIRST");

        // merge된 최종 배열 출력
        outPutMergeArray(array);
    }


    private static void mergeSortDevide(int[] array,int left,int right,String type) {
        if (left < right) {
            // 반으로 나누기 위한 변수
            int mid = (left+right)/2;
            System.out.println("MERGESORTDEVIDE TYPE : " + type + " / ARRAY : " + Arrays.toString(array) + " / LEFT : " + left + " / RIGHT : " + right + " / MID : "+mid);
            
            // 앞(왼쪽) 부분 재귀 호출
            mergeSortDevide(array,left,mid,"LEFT");

            // 뒤(오른쪽) 부분 재귀 호출
            mergeSortDevide(array,mid+1,right,"RIGHT");

            // 원소를 머지하는 함수
            merge(array,left,mid,right,type);
        }
    }

    private static void merge(int[] array,int left,int mid,int right,String type) {
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

        System.out.println("MERGE TYPE : " + type + " / LEFT : " + left + " / MID : " + mid + " / RIGHT : " + right);
        System.out.println("TYPE : " + type + " / TEMP : " + Arrays.toString(temp));

        for (int index=left;index<tempIndex;index++) {
            array[index] = temp[index];
        }

        System.out.println("TYPE : " + type + " / ARRAY : " + Arrays.toString(array));
    }

    private static void outPutMergeArray(int[] array) {
        System.out.println(Arrays.toString(array));
        System.out.println();
    }
}
