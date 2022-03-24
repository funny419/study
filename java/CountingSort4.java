import java.util.Arrays;

public class CountingSort4 {
    public static void main(String[] args) {
        int maxValue = Integer.MIN_VALUE;
        int[] array = new int[30];
        for (int i=0;i<array.length;i++) {
            array[i] = (int)(Math.random()*30);
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }

        // 최대값 +1 만큼의 크기를 갖는 배열 생성
        int[] counts = new int[maxValue+1];

        // counts에 각 항목별 개수 저장
        for (int i=0;i<array.length;i++) {
            counts[array[i]]++;
        }

        // 아래 부터 누적해서 counts 배열 업데이트 하기
        for (int i=1;i<counts.length;i++) {
            counts[i] += counts[i-1];
        }

        // 새로운 배열에 정렬해서 저장
        int[] sorted = new int[array.length];
        for (int i=array.length-1;i>=0;i--) {
            int loc = counts[array[i]]--;
            sorted[loc - 1] = array[i];
        }

        System.out.println("정렬 : " + Arrays.toString(sorted));
    }
}
