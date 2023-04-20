import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum_LT_18 {
    public static void main(String[] args) {
        int [] array = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;

        List<List<Integer>> answer = fourSum(array,target);
        System.out.println(answer);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int i,j;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(i=0;i< nums.length-3;i++){

            if(i!=0 ){
                while(i<nums.length-3 && nums[i]==nums[i-1])
                    i++;
            }

            for(j=i+1;j<nums.length-2;j++) {

                if(j!=i+1){
                    while(j<nums.length-2 && nums[j]==nums[j-1])
                        j++;
                }

                int left = j + 1, right = nums.length - 1;

                while (left < right) {

                    long current = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if(current == target) {
                        ans.add(List.of(nums[i], nums[j], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    }
                    else if (current < target){
                        left++;
                    }
                    else{
                        right--;
                    }

                }
            }
        }
        return ans;
    }
}
