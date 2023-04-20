package ArithmeticSlices_LT_431;

public class Approach1 {
    public static void main(String[] args) {
        int[]nums = {1,2,3,4};
        int ans = numberOfArithmeticSlices(nums);
    }
    public static int numberOfArithmeticSlices(int[] nums) {
        int count =0;
        int i,j;
        int current_difference;

        for(i=0;i<nums.length-2;i++){
            current_difference = nums[i+1]-nums[i];
            j=i;
            while(j+2<nums.length){
                if(current_difference!=nums[j+2]-nums[j+1]){
                    break;
                }
                count++;
                j++;
            }
        }

        return count;
    }
}
