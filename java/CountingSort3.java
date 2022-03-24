import java.util.Arrays;
import java.util.Collections;

public class CountingSort3 {
    public static void main(String[] args) {
        Integer[] array = {1,0,3,1,3,1};
        array = sort(array);
        System.out.println(Arrays.toString(array));
    }


    public static Integer[] sort(Integer[] array) {
        int max = Collections.max(Arrays.asList(array));
        Integer[] aux = new Integer[array.length];
        Integer[] c = new Integer[max+1];
        Arrays.fill(c,0);

        // 각 원소 개수 계산
        for (int i=0;i<array.length;i++) {
            c[array[i]] += 1;
        }

        // 누적합 계산
        for (int i=1;i<c.length;i++) {
            c[i] += c[i-1];
        }

        // 누적합을 이용해 정렬
        for (int i=array.length-1;i>=0;i--) {
            aux[--c[array[i]]] = array[i];
        }

        return aux;
    }
}
