package LongestComonSubsequence_1143;

public class myApproach {
    public static void main(String[] args) {

        String text1 = "abcde";
        String text2 = "ace";
        int answer = longestCommonSubsequence(text1,text2);
        System.out.println(answer);

    }

    public static int longestCommonSubsequence(String text1, String text2) {
        String longWord;
        String shortWord;
        if(text1.length()<=text2.length()){
            longWord = text2;
            shortWord = text1;
        }
        else{
            longWord = text1;
            shortWord = text2;
        }




        return 0;
    }
}
