package CombinationsSumI_LT_39;

import java.util.ArrayList;
import java.util.List;

public class myApproach {
    public static void main(String[] args) {
     int[] candidates = {2,3,6,7};
     int target = 7;

     List<List<Integer>> answer = combinationSum(candidates,target);
        System.out.println(answer);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target){
      List<List<Integer>> result = new ArrayList<>();
      findCombinations(candidates, 0, target, new ArrayList<>(), result);

      return result;

    }
    public static void findCombinations(int[]candidates, int index, int target, List<Integer> current, List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i=index;i<candidates.length; i++){
            if(candidates[i]<=target){
                current.add(candidates[i]);
                findCombinations(candidates,i,target-candidates[i], current, result);
                current.remove(Integer.valueOf(candidates[i]));
            }
        }
    }
}
