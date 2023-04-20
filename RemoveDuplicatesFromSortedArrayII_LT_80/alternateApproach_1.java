package RemoveDuplicatesFromSortedArrayII_LT_80;

public class alternateApproach_1 {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,1,2,3,3};

        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] nums) {

        int count=1;
        int k=1,i;

        for(i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=2){
                nums[k++] = nums[i+1];
            }
        }
        return k;
    }


}
