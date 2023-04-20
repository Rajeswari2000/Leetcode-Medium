package ReverseWordsInAString_LT_151;

public class myApproach {
    public static void main(String[] args) {
      String input="the sky is blue";
      String answer = reverseWords(input);
        System.out.println(answer);
    }
    public static String reverseWords(String s) {
        int i;
        String ans="";
        String answer = "";
        char ch;

        for(i=s.length()-1;i>=0;i--){
            ch = s.charAt(i);

            if(ch==' '){
                answer = answer+" "+ans;
                ans="";
                while(ch==' ' && i>=0){
                    ch = s.charAt(i);
                    i--;
                }
                i++;
            }
            ans=ch+ans;
        }
        if(s.charAt(s.length()-1)!=' '){
            answer = answer+" "+ans;
        }

        return answer;
    }
}
