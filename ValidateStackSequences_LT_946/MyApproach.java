package ValidateStackSequences_LT_946;

import java.util.Stack;

public class MyApproach {

    public static void main(String[] args) {
       int[] pushed = {0,2,1};
       int [] popped = {0,1,2};
       boolean answer =  validateStackSequences(pushed,popped);

        System.out.println(answer);
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> stack = new Stack<>();
        int j=0;

        for(int i=0;i<pushed.length;i++){
            stack.push(pushed[i]);

             while(!stack.isEmpty() && stack.peek()==popped[j]){
                 stack.pop();
                 j++;
             }


        }


       return stack.isEmpty();
    }

}
