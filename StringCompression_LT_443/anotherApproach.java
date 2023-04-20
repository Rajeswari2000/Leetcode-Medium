package StringCompression_LT_443;

import java.util.Arrays;

public class anotherApproach {
    public static void main(String[] args) {
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
        int i;

        for(i=0;i<chars.length-1;i++){

            while(i==i+1){
                count++;
            }



        }












        return 0;
    }

}
