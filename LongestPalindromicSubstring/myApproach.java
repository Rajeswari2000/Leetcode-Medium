package LongestPalindromicSubstring;

public class myApproach {
    public static void main(String[] args) {
       String ans = longestPalindrome("malayalamhello");
        System.out.println(ans);
    }
    public static String longestPalindrome(String s) {
        if(s.length()==0) return "";
        if(s.length()==1)return s;
        int i,j,maximumLength=0;
        String temporaryString;
        String answer="";

        for(i=0;i<=s.length();i++){
            for(j=i+1;j<=s.length();j++){
                temporaryString= s.substring(i, j);
                if(isPalindrome(temporaryString)){
                    if(maximumLength<temporaryString.length()){
                        maximumLength = temporaryString.length();
                        answer = temporaryString;
                    }

                }
            }
        }
        if(answer=="") return "";
        return answer;


    }

    public static boolean isPalindrome(String str){
        int i;
        String reverse="";
        for(i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        if(str.equals(reverse)) return true;

        return false;
    }

}
