package Subsets_LT_78;

import java.util.ArrayList;
import java.util.List;

public class forLoopAndRecursion {

    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
        int[] nums = {1,2,3};
        List<List<Integer>> ans = subsets(nums);
        System.out.print(ans);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
      //  Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
