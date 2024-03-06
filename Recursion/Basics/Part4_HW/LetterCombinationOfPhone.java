package DSA_Java.Recursion.Basics.Part4_HW;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhone {
    List<String> result=new ArrayList<>();
    String[] letters={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinationLogic(String digits,int idx,String output){
        if(digits.isEmpty()){
            return new ArrayList<>();
        }
        if(idx==digits.length()){
            result.add(output);
            return result;
        }

        int idxValue=Integer.parseInt(String.valueOf(digits.charAt(idx)));
        for(int i=0;i<letters[idxValue].length();i++){
            letterCombinationLogic(digits,idx+1,output+letters[idxValue].charAt(i));
        }
        return result;

    }

    public List<String> letterCombinations(String digits) {
        return letterCombinationLogic(digits,0,"");
    }

    public static void main(String[] args) {
        LetterCombinationOfPhone obj=new LetterCombinationOfPhone();
        System.out.println(obj.letterCombinations("23"));
    }
}
