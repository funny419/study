public class MergeSort {
    public static int[] src;
    public static int[] tmp;
    
    public static void main(String[] args) {
        src = new int[]{1,9,8,5,4,2,3,7,6};
        tmp = new int[src.length];

        System.out.println("<정렬 전>");
        printArray(src);

        mergeSort(0,src.length-1);

        System.out.println("<정렬 후>");
        printArray(src);
    }

    /**
     * start는 merge sort를 진행할 배열의 시작 인덱스를 의미하고, end는 마지막으로 포함될 배열의 인덱스를 의미한다.
     * binary tree형태로 쪼개기 때문에 int mid라는 start, end의 중간 지점을 지정한다.
     * 
     * 실제 분활을 진행하는데 첫 분활은 시작점부터 중간점까지인 mergeSort(start,mid)가 되고,
     * 두 번째 분활은 중간점 다음부터 끝점까지인 mergeSort(mid+1,end)가 된다.
     * 
     * 그 다음 int p와 int q에 두 분활의 첫 번째 원소인 인덱스를 저장한다.
     * 이 값을 저장하는 이유는, 해당 인덱스의 값을 비교하여 어떤 원소를 참조할지 정하기 때문이다.
     * start는 항상 mid+1보다 작기 때문에, 분활의 저장 위치는 start 지점이 된다. 그래서 int idx는 p가 된다.
     * 
     * 그리고, p가 mid이하이거나 q가 end이하일때 동작해야 한다. 그렇지 않은 경우 원소의 개수가 1개일때까지 쪼개지고
     * 동시에 종료 되지 않을 수 있으므로 두 경우를 &&가 아닌 ||으로 하는것에 주의하자.
     * 
     * 첫 번째 분할에서 원소를 가져오는 경우는 다음과 같다.
     * 1. 두 번째 분할의 원소를 이미 다 가져온 경우 (q > end)
     * 2. 첫 번째 분할에서 가져오지 않은 원소가 있고, 첫번째 분할의 첫 원소 값이 두 번째 분할의 첫 원소 값보다 작은 경우
     * 
     * 위 조건을 표현하면 다음과 같다.
     * 1. q > end
     * 2. p <= mid && src[p] < src[q]
     * 
     * @param start
     * @param end
     */
    private static void mergeSort(int start,int end) {
        if (start < end) {
            int mid = (start+end) / 2;
            mergeSort(start,mid);
            mergeSort(mid+1,end);

            int p = start;
            int q = mid + 1;
            int idx = p;

            while (p <= mid || q <= end) {
                if (q > end || (p <= mid && src[p] < src[q])) {
                    tmp[idx++] = src[p++];
                } else {
                    tmp[idx++] = src[q++];
                }
            }

            for (int i=start;i<=end;i++) {
                src[i] = tmp[i];
            }
        }
    }


    public static void printArray(int[] a) {
        for (int i=0;i<a.length;i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }
}
