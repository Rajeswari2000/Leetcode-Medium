package StringCompression_LT_443;

import java.util.Arrays;

public class myApproach {

    public static void main(String[] args) {
       // char[] chars = {'a','a','b','b','c','c','c'};
        char[] chars = {'a','a','c','c','c','c','c','c','c','c','c','c','c'};
        int answer = compress(chars);
        System.out.println(answer);
        System.out.println(Arrays.toString(chars));
    }
    public static int compress(char[] chars) {
        if(chars.length==1)return 1;
        int count =1;
        char ch = chars[0];
        String ans="";
        int i,j;
        int lastPos=0;
        for(i=0;i<chars.length;i++){
            for(j=i+1;j<chars.length;j++){
                if(chars[i]==chars[j]){
                    count++;
                }
                else{
                   ans=ans+ch+count;
                   String count1=count+"";
                   int k=0;
                   while(k<count1.length())
                   chars[i+1+k]=count1.charAt(k++) ;
                   i=j;
                   ch=chars[j];
                   count=1;
                   lastPos=j+1;
                }
            }
            i=j;
        }
        ans = ans+ch+count;
        String count1=count+"";
        int k=0;
        while(k<count1.length())
            chars[lastPos+k]=count1.charAt(k++) ;
        //chars[lastPos]=(char)(count +'0');
        System.out.println(ans);
        return ans.length();
    }
}
