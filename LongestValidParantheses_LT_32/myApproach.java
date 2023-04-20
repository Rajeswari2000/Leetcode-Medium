package LongestValidParantheses_LT_32;

import java.util.Stack;

public class myApproach {
    public static void main(String[] args) {
         String string = ")()())";
         int answer = longestValidParentheses(string);
        System.out.println(answer);
    }

    public static int longestValidParentheses(String string) {

        int longest = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<string.length();i++){
            char ch = string.charAt(i);

            if(ch=='('){
                stack.push(i);
            }
            else{
                if(!stack.isEmpty() && string.charAt(stack.peek())=='('){
                    stack.pop();
                }
                else{
                    stack.push(i);
                }
            }
        }

        if(stack.isEmpty()) return string.length()-1;

        int n = string.length();
        int a;

        while(!stack.isEmpty()){
            a=stack.pop();
            longest = Math.max(longest,n-a-1);
            n=a;
        }

        longest = Math.max(longest,n-0);
       return longest;
    }
}
