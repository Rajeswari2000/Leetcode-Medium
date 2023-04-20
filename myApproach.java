import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class myApproach {
    public static void main(String[] args) {
        String s = "aa", p = "bb";
        List<Integer> answer =  findAnagrams(s,p);
        System.out.println(answer);

    }

    public static List<Integer> findAnagrams(String s, String p) {

        int [] frequencyOfP = new int[26];
        int [] frequencyInS = new int[26];

        List<Integer> answer = new ArrayList<>();

        for(int j=0;j<p.length();j++){
            char ch1 = p.charAt(j);
            frequencyOfP[ch1-'a']++;
        }


        for(int i=0; i<=s.length()-p.length(); i++){
            for(int k=i;k<i+p.length();k++){
                char ch = s.charAt(k);
                frequencyInS[ch-'a']++;
            }
            if(Arrays.equals(frequencyOfP,frequencyInS)) answer.add(i);
            Arrays.fill(frequencyInS,0);
        }

        return answer;
    }
}
