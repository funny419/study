public class MergeSort6 {
    public static int[] mergeSort(int[] array,int left,int right) {
        if (left < right) {
            int mid = (left+right)/2;
            mergeSort(array,left,mid);
            mergeSort(array,mid+1,right);
            merge(array,left,mid,right);
        }

        return array;
    }

    public static int[] merge(int[] array,int left,int mid,int right) {
        int temp[] = new int[array.length];

        int i = left;
        int j = mid + 1;
        int tempIdx = left;

        while (i<=mid && j<=right) {
            if (array[i] < array[j]) {
                temp[tempIdx] = array[i];
                i++;
            } else {
                temp[tempIdx] = array[j];
                j++;
            }

            tempIdx++;
        }

        if (i > mid) {
            while (j <= right) {
                temp[tempIdx] = array[j];
                tempIdx++;
                j++;
            }
        }
        else {
            while (i <= mid) {
                temp[tempIdx] = array[i];
                tempIdx++;
                i++;
            }
        }

        for (tempIdx=left;tempIdx<=right;tempIdx++) {
            array[tempIdx] = temp[tempIdx];
        }

        return array;
    }
}
