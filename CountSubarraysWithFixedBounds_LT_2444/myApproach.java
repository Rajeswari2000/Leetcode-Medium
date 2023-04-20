package CountSubarraysWithFixedBounds_LT_2444;

import java.util.ArrayList;
import java.util.List;

public class myApproach {


    public static void main(String[] args) {
        int[] nums={1,3,5,2,7,5};
        int minK = 1;
        int maxK = 5;

        long answer = countSubarrays(nums,minK,maxK);
        System.out.println(answer);

    }
    public static long countSubarrays(int[] nums, int minK, int maxK) {


        List<List<Integer>> listOfList = new ArrayList<>();
        ArrayList<Integer> eachList = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j]<=maxK && nums[j]>=minK){
                    eachList.add(nums[j]);
                }
                else{
                    eachList.clear();
                    i=j;
                    break;
                }
                if(eachList.contains(minK) && eachList.contains(maxK)){
                    listOfList.add(eachList);

                }
            }
        }


        return (long)listOfList.size();
    }

}
