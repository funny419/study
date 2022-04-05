package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] solution(int[] nums,int target) {
        int len = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<len;++i) {
            final Integer value = map.get(nums[i]);
            if (value != null) {
                return new int[] {value,i};
            }
            map.put(target-nums[i],i);
        }

        return null;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{2,7,11,15};
        int target = 22;
        System.out.println(Arrays.toString(twoSum.solution(nums,target)));
    }
}
