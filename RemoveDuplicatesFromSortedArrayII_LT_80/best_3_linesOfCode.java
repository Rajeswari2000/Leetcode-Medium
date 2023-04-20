package RemoveDuplicatesFromSortedArrayII_LT_80;

public class best_3_linesOfCode {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,1,2,3,3};

        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] nums) {

        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                nums[i++] = n;
            }
        }
        return i;
    }
}
