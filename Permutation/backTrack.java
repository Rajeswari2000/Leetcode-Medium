package Permutation;

import java.util.ArrayList;
import java.util.List;

public class backTrack {
    static List<List<Integer>> result;
    static List<Integer> each_combination;

    public static void main(String[] args) {
        int[]nums = {1,2,3};
        List <List<Integer>> ans = permute(nums);
        System.out.println(ans);
    }
    public static  List<List<Integer>> permute(int[] nums) {
        boolean [] isUsed=new boolean[nums.length];
        result = new ArrayList<>();
        each_combination = new ArrayList<>();
        backtrack(result,each_combination,nums,isUsed);
        return result;
    }
    public static void backtrack(List<List<Integer>> result,List<Integer> each_combination,int[]nums,boolean[]isUsed){

        if(each_combination.size()==nums.length){
            result.add(new ArrayList(each_combination));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(isUsed[i]){
                continue;
            }
            each_combination.add(nums[i]);
            isUsed[i]=true;
            backtrack(result,each_combination,nums,isUsed);
            isUsed[i] = false;
            each_combination.remove(each_combination.size()-1);
        }

    }
}
