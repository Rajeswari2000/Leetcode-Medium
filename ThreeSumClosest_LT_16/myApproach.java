package ThreeSumClosest_LT_16;

import java.util.Arrays;

public class myApproach {
    public static void main(String[] args) {
        int[] nums = {2,3,8,9,10};
        int target = 16;

        int ans = threeSumClosest(nums, target);
        System.out.println(ans);
    }

    public static int threeSumClosest(int[] nums, int target) {
        int currentSum;
        int current_difference,min_difference=Integer.MAX_VALUE;

        int i,left,right,answer=0;

        Arrays.sort(nums);

        for(i=0;i<nums.length-2;i++){
            left=i+1;
            right=nums.length-1;

            while(left<right){
                currentSum = nums[i]+nums[left]+nums[right];

                if(currentSum == target) return target;

                current_difference = Math.abs(target-currentSum);

                if (current_difference < min_difference) {
                    answer = currentSum;
                    min_difference = current_difference;
                }

                if(currentSum<target)left++;
                if(currentSum>target)right--;
            }
        }

        return answer;
    }
}
