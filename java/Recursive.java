import java.util.Arrays;

public class Recursive {
    public static void main(String[] args) {
        int array[] = {1,2,3};
        permutation(array,0,3);
    }


    public static void permutation(int[] array,int depth,int r) {
        if (depth == r) {
            print(array,r);
            return;
        }

        for (int i=depth;i<array.length;i++) {
            swap(array,depth,i); // 순서 변경
            permutation(array,depth+1,r); // 아래로 탐색
            swap(array,depth,i); // 되돌리기
        }
    }

    private static void swap(int[] array,int depth,int i) {
        int temp = array[depth];
        array[depth] = array[i];
        array[i] = temp;
    }

    private static void print(int[] array,int r) {
        int printArr[] = array.clone();
        if (printArr.length > r) {
            for (int i=0;i<printArr.length;i++) {
                if (i+1 > r) {
                    printArr[i] = -1;
                }
            }
        }

        System.out.println("Array : " + Arrays.toString(printArr));
    }
}
