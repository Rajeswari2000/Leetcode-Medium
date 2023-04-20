package AppendKIntegersWithMinimalSum_LT_2195;

import java.util.ArrayList;
import java.util.Arrays;

public class myApproach {
    public static void main(String[] args) {

    }
    public static long minimalKSum(int[] nums, int k) {
        long ans=0;
        Arrays.sort(nums);
        int j=1;
        // ArrayList<Integer> array = new ArrayList<Integer>(/*Arrays.asList(nums)*/);
        ArrayList<Long> arrayList = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=j){
                arrayList.add((long)j);
            }
            if(arrayList.size()==k) break;
            j++;
        }

        while(arrayList.size()!=k){

            if(!Arrays.asList(nums).contains(j)){
                arrayList.add((long)j);
            }
            j++;
        }

        for(Long a : arrayList){
            ans+=a;
        }
        System.out.println(arrayList);

        return ans;
    }
}
