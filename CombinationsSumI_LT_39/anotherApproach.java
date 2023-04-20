package CombinationsSumI_LT_39;

import java.util.ArrayList;
import java.util.List;

public class anotherApproach {

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;

        List<List<Integer>> answer = combinationSum(candidates,target);
        System.out.println(answer);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> listOfArrayList = new ArrayList<>();
        List<Integer> eachArrayList = new ArrayList<>();
        recursion(0,listOfArrayList,eachArrayList,candidates,target);
        return listOfArrayList;
    }
    public static void recursion(int i,List<List<Integer>> listOfArrayList, List<Integer> eachArrayList,int[] candidates, int target){
        if(i == candidates.length){
            if(target==0)
                listOfArrayList.add(new ArrayList<>(eachArrayList));
            // System.out.println("i'm from the list"+listOfArrayList);
            return;
        }

        if(candidates[i]<=target){
            eachArrayList.add(candidates[i]);
            recursion(i,listOfArrayList,eachArrayList,candidates,target-candidates[i]);
            eachArrayList.remove(eachArrayList.size()-1);
        }
        recursion(i+1,listOfArrayList,eachArrayList,candidates,target);


        // System.out.println("i'm after addition"+eachArrayList);


        // System.out.println("i'm after removal"+eachArrayList);


    }
}
