package LongestSubstringWithoutRepeatingCharacter_Leetcode_3;

public class Approach1 {
    public static void main(String[] args) {
        int length = lengthOfLongestSubstring("abcabcbb");
        System.out.println(length);
    }
    public static int lengthOfLongestSubstring(String s) {

        int longestSubLeng = 0;
        String longestSubString = "";

        for(int i=0; i<s.length(); i++){
            if(longestSubString.indexOf(s.charAt(i)) == -1){ //not in string yet
                longestSubString += s.charAt(i);
            }else{
                if(longestSubString.length()>longestSubLeng){
                    longestSubLeng = longestSubString.length();
                }
                int index = longestSubString.indexOf(s.charAt(i)); //find where to start the new substring
                longestSubString = longestSubString.substring(index+1,longestSubString.length()) + s.charAt(i);
            }
        }
        return Math.max(longestSubString.length(), longestSubLeng);
    }

}
