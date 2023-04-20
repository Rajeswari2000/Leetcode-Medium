package MaximumSumofDistinctSubarraysWithLengthK_LT_2461;

import java.util.HashSet;

public class myApproachSlidingWindow {
    public static void main(String[] args) {

        int[]nums = {9,9,9,1,2,3};
        //int[]nums={4,4,4};
        long answer = maximumSubarraySum(nums,3);
        System.out.println(answer);
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> HS = new HashSet<>();
        int windowSum=nums[0];
        int maxSum=0;
        int limit=1;
        int y=0;
        HS.add(nums[0]);
        while(HS.size()<k && limit<nums.length){
            if(!HS.contains(nums[limit])) {
                HS.add(nums[limit]);
                windowSum+=nums[limit];
            }
            limit++;
            if(limit==k && HS.size()!=k){
                y++;
                limit=y;
                HS.clear();
                windowSum=0;
            }


        }
        if(HS.size()!=k)return 0;
        maxSum=Math.max(windowSum,maxSum);

        for(int i=limit;i<nums.length;i++){
            if(!HS.contains(nums[i])) {
                HS.add(nums[i]);
                windowSum+= nums[i]-nums[i-limit];
                HS.remove(nums[i-limit]);
            }
            limit=k;
            maxSum = Math.max(windowSum,maxSum);
        }


        return (long)maxSum;

    }

}

