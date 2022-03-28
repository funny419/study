import java.util.Arrays;

public class CountingSort6 {
    public static void main(String[] args) {
        int[] array = {1,4,2,7,4,9,8,6};

        // 1 Step MaxValue 검색
        int maxValue = array[0];
        for (int i=0;i<array.length;i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }

        // 2 Step 항목에 대한 Counting
        int[] counting = new int[maxValue+1];
        for (int i=0;i<array.length;i++) {
            counting[array[i]]++;
        }

        // 3 Step Counting에 대한 누적 합산
        for (int i=1;i<counting.length;i++) {
            counting[i] += counting[i-1];
        }

        // 4 Step 누적 합산된 내용 기준으로 정렬
        int[] result = new int[array.length];
        for (int i=array.length-1;i>=0;i--) {
            counting[array[i]]--;
            result[counting[array[i]]] = array[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
