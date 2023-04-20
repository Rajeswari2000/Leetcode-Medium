package PrintWordsVertically_LT_1324;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class myApproach {
    public static void main(String[] args) {
        System.out.println(printVertically( "TO BE OR NOT TO BE"));
    }
    public static List<String> printVertically(String s) {
        // List <String> ans_list = new ArrayList<>(Arrays.asList(s.split(" ")));
        String []input = s.split(" ");
        int i,j,max_length=0;
        boolean a=false;

        for(i=0;i<input.length;i++){
            max_length=Math.max(input[i].length(),max_length);
        }

        if(input[input.length-1].length()<max_length) a=false;
        else if(input[input.length-1].length()==max_length)  a= true;

        String []ans = new String[max_length];
        Arrays.fill(ans,"");


        for(i=max_length-1;i>=0;i--){
            for(j=input.length-1;j>=0;j--){
                if(input[j].length()==max_length)a=true;
                if(a==false){
                    continue;
                }
                else if(a==true && input[j].length()<i+1){
                    ans[i]=" "+ans[i];
                }
                else{
                    ans[i]=input[j].charAt(i)+ans[i];
                }
            }
        }

        for(i=0;i<ans.length;i++){
            ans[i]=ans[i].stripTrailing();
        }

        List <String> ans_list = new ArrayList<>(Arrays.asList(ans));
        return ans_list;

    }

}







//  String []input = s.split(" ");
//        int i,j,max_length=0;
//        for(i=0;i<input.length;i++){
//            max_length=Math.max(input[i].length(),max_length);
//        }
//        String []ans = new String[max_length];
//        //Arrays.fill(ans,"");
//
//
//        for(i=0;i<max_length;i++){
//            for(j=0;j<input.length;j++){
//                if(i<input[j].length()){
//                    ans[i]=ans[i]+input[j].charAt(i);
//                }
//                else{
//                    ans[i]=ans[i]+" ";
//                }
//            }
//        }
//
//        List<String> ans_list = new ArrayList<>(Arrays.asList(ans));
//        return ans_list;