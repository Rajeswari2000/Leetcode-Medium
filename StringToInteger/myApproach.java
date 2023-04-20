package StringToInteger;

public class myApproach {
    public static void main(String[] args) {
        int ans = myAtoi("00000-42a1234");
        System.out.println(ans);
    }
    public static int myAtoi(String s) {

//        ASCII values
//        0-->48
//        9-->57
//        + --> 43
//        - -->45
        String ans = "";
        int i,sign=1,j;
        char ch;
        boolean a;
        long answer;

        for(i=0;i<s.length();i++){
            ch = s.charAt(i);

            if(ch==43 || ch==45 ){
                sign = (ch==43)? 1 : -1;
            }
            else if(ch==32){
                continue;
            }
            else if(Character.isDigit(ch)){
                break;
            }
            else{
                return 0;
            }

        }

        while(i<s.length()){
            ch = s.charAt(i++);
            if(Character.isDigit(ch)){
                ans+=ch;
            }
            else if(ch==46){
                break;
            } else if(ch==43 || ch==45){
                return 0;
            }
        }

        answer = sign*Long.parseLong(ans);

        if(answer>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        else if(answer<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        return (int)answer;
         }

}

//  9,223,372,036,854,775,807    19
//  20,000,000,000,000,000,000   20