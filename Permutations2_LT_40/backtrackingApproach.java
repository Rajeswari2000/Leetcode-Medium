package Permutations2_LT_40;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class backtrackingApproach {
    static List<List<Integer>> result;
    static List<Integer> each_combination;

    public static void main(String[] args) {
        int[]nums = {1,2,3};
        result = new ArrayList<>();
        each_combination = new ArrayList<>();
        List <List<Integer>> ans = permute(nums);
        System.out.println(ans);
    }

    public static List<List<Integer>> permute(int[] nums) {

        boolean [] isUsed = new boolean[nums.length];
        backtrack(nums,isUsed);
        return result;
    }
    public static void backtrack( int[]nums,boolean[]isUsed){

        if(each_combination.size()==nums.length){
            result.add(new ArrayList(each_combination));
            return;
        }
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(isUsed[i]){
                continue;
            }
            if(!set.add(nums[i])){
                continue;
            }
            each_combination.add(nums[i]);
            isUsed[i]=true;
            backtrack(nums,isUsed);
            isUsed[i] = false;
            each_combination.remove(each_combination.size()-1);
        }
    }
}
