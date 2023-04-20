package LetterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class myApproach {

    public static void main(String[] args) {
        String numberComb = "23";
    }

    public static List<String> letterCombinations(String digits) {
        Map <Character,String> hashMap = new HashMap<>();
        hashMap.put('2',"abc");
        hashMap.put('3',"def");
        hashMap.put('4',"ghi");
        hashMap.put('5',"jkl");
        hashMap.put('6',"mno");
        hashMap.put('7',"pqrs");
        hashMap.put('8',"tuv");
        hashMap.put('9',"wxyz");

        List<String> listOfString = new ArrayList<>();
        return listOfString;
    }
}
