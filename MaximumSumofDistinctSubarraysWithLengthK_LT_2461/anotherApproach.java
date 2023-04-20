package MaximumSumofDistinctSubarraysWithLengthK_LT_2461;

import java.util.HashSet;
import java.util.Set;

public class anotherApproach {

    public static void main(String[] args) {

        int[]nums = {5,3,3,1,1};
        //int[]nums={4,4,4};
        long answer = maximumSubarraySum(nums,3);
        System.out.println(answer);
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int start = 0, end = 0;
        Long sum = 0l, max = 0l;
        Set<Integer> set = new HashSet<>();
        while (end < n) {
            int val = nums[end];
            while (set.contains(val) || (end - start + 1 > k) && start < end) {
                sum -= nums[start];
                set.remove(nums[start++]);
            }
            sum += val;
            set.add(val);
            if (end - start + 1 == k)
                max = Math.max(max, sum);
            end++;
        }
        return max;
    }


}
