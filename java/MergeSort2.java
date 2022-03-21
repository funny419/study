import java.util.Arrays;

public class MergeSort2 {
    static int[] sorted;
    
    public static void main(String[] args) {
        int[] array = {4,3,9,2,7,1,6,5,8};
        sorted = new int[array.length];

        mergeSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array,int start,int end) {
        if (start < end) {
            int mid = (start+end) / 2;
            mergeSort(array,start,mid);
            mergeSort(array,mid+1,end);
            merge(array,start,mid,end);
        }
    }

    private static void merge(int[] array,int start,int mid,int end) {
        int i,j,k,l;
        i = start; // 시작 임시 인덱스 값
        j = mid + 1; // 중간 임시 인덱스 값
        k = start; // 시작 임시 인덱스 값 (임시 배열 index의 역활)

        // 앞 배열과 뒷 배열 중 먼저 끝나는 배열이 있을 때 까지 반복
        while (i <= mid && j <= end) {
            sorted[k++] = (array[i] <= array[j]) ? array[i++] : array[j++];
        }

        // 앞 배열이던 뒷 배열이던 먼저 끝나지 않은 배열의 남은 값(정렬된 값)을 임시 배열에 넣는 작업
        if (i <= mid) {
            for (l=i;l<=mid;l++) {
                sorted[k++] = array[l];
            }
        } else {
            for (l=j;l<=end;l++) {
                sorted[k++] = array[l];
            }
        }

        // 정렬된 임시 배열을 완성된 부분 배열로
        for (l=start;l<=end;l++) {
            array[l] = sorted[l];
        }
    }
}
