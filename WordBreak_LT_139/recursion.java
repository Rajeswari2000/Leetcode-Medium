package WordBreak_LT_139;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class recursion {
    public static void main(String[] args) {

//       List <String> wordDict  = new ArrayList<>(Arrays.asList("cats","dog","sand","and","cat"));
//       String s = "catsandog";
        List <String> wordDict  = new ArrayList<>(Arrays.asList("leet","code"));
        String s = "leetcode";


        boolean answer = wordBreak(s,wordDict);
        System.out.println(answer);
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
      boolean [] DP = new boolean[s.length()+1];
      Arrays.fill(DP,true);
      return wordBreakRecursion(s,wordDict,DP,0);
    }

    public static boolean wordBreakRecursion(String s, List<String> wordDict, boolean[] DP, int index){

        if(index==s.length()){
            return true;
        }

        for(int j=0; j<wordDict.size(); j++){

            if(wordDict.get(j).length()+index<=s.length() &&  DP[index] && wordDict.get(j).equals(s.substring(index,wordDict.get(j).length()+index))){
               boolean ans= wordBreakRecursion(s, wordDict, DP, index+wordDict.get(j).length());

               if(ans){
                   return true;
               }
               else{
                   DP[index+wordDict.get(j).length()]=false;
               }
            }
        }

        return false;
    }
}
