package Subsets_LT_78;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsets_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,2,3};
        List<List<Integer>> ans = subsets(nums);
        System.out.print(ans);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        helper(0,nums,ans,ds);
        return ans;
    }
    public static void helper(int index,int[] arr,List<List<Integer>> ad,ArrayList<Integer> ds){
        if(index==arr.length){
            ad.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[index]);
        helper(index+1,arr,ad,ds);         //index   //array   //listOfList   //arrayList
        ds.remove(ds.size()-1);
        helper(index+1,arr,ad,ds);

    }
}
