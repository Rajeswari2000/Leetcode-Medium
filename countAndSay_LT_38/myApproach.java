package countAndSay_LT_38;

public class myApproach {
    public static void main(String[] args) {
       int n=4;

       System.out.println(countAndSay(n));
    }
    public static String countAndSay(int n) {
        if(n==1)return "1";
        if(n==2)return "11";
        String ans="";

        String current="11";
        String answer="";
        int i,j,count=1;
        for(j=0;j<n-2;j++){
            for(i=0;i<current.length()-1;i++){
                if(current.charAt(i)==current.charAt(i+1)){
                    count++;
                }
                else{
                    answer+=String.valueOf(count)+(current.charAt(i));
                    //System.out.println(answer);
                    count=1;

                }
            }
            answer+=String.valueOf(count)+(current.charAt(i));
            //System.out.println(answer);
            count=1;
            current=answer;
            ans = answer;
            answer="";

        }
        return ans;
    }
}
