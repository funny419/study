public class QuickSort2 {
    public void sort(int[] array,int left,int right) {
        int l = left;
        int r = right;
        int pivot = array[(left+right)/2];

        do {
            while (array[l] < pivot) {
                l++;
            }

            while (array[r] > pivot) {
                r--;
            }

            if (l <= r) {
                int temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                l++;
                r--;
            }
        } while (l <= r);

        if (left < r) {
            sort(array,left,r);
        }

        if (right > l) {
            sort(array,l,right);
        }
    }

    public static void main(String[] args) {
        int[] array = {66, 10, 1, 34, 5, -10};

        QuickSort2 quick = new QuickSort2();
        quick.sort(array,0,array.length-1);

        for (int i=0;i<array.length;i++) {
            System.out.print("array["+i+"] :  " + array[i]);
        }
    }
}
