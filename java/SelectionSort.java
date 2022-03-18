import java.util.Arrays;

public class SelectionSort {
    static int[] nums;

    public static void main(String[] args) {
        nums = new int[10];
        for (int i=0;i<10;i++) {
            nums[i] = (int) (Math.random() * 10);
        }

        System.out.println("<정렬전>");
        System.out.println(Arrays.toString(nums));

        for (int i=0;i<nums.length-1;i++) {
            int minIndex = i;
            for (int j=i+1;j<nums.length;j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }

                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
        }

        System.out.println("<정렬후>");
        System.out.println(Arrays.toString(nums));
    }
}
