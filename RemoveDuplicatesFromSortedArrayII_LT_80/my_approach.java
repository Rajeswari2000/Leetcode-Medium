package RemoveDuplicatesFromSortedArrayII_LT_80;

public class my_approach {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,1,2,3,3};

        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int i,count=1,j,curr_index=0;


        for(i=0;i<nums.length-1;i++){

            if(nums[i]==nums[i+1]){
                count++;
            }

            if(nums[i]!=nums[i+1]){
                if(count<3){
                    for(j=1;j<=count;j++){
                        nums[curr_index++]=nums[i];
                    }
                }
                else{
                    for(j=1;j<=2;j++){
                        nums[curr_index++]=nums[i];
                    }
                }
                count=1;
            }

        }
        if(nums[i-1]==nums[i]){
            count++;
            if(count<3){
                for(j=1;j<=count;j++){
                    nums[curr_index++]=nums[i];
                }
            }
            else{
                for(j=1;j<=2;j++){
                    nums[curr_index++]=nums[i];
                }
            }
            curr_index--;
        }
        else{
            nums[curr_index]=nums[i];
        }
        return curr_index+1;

    }
}
