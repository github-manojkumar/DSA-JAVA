package DSA_Java.Recursion.Basics.Part2_HW;

public class SeparateDuplicates {
    public static void main(String[] args) {
        String str="helloollooll";
        System.out.println(separateDuplicates(str,0,""));
    }

    private static String separateDuplicates(String str,int idx,String output){
        if(idx==str.length()){
            return output;
        }
        char currentChar=str.charAt(idx);
        if(idx==0 || str.charAt(idx-1)!=currentChar){return separateDuplicates(str,idx+1,output+String.valueOf(currentChar));}
        else if(currentChar==str.charAt(idx-1)){
            return separateDuplicates(str,idx+1,output+"*");
        }
        return output;
    }
 /*
    private static String separateDuplicates(String str,int idx,String newStr){
        if(idx>=str.length()-1){
            newStr+=String.valueOf(str.charAt(idx));
            return newStr;
        }
        String firstCharacter=String.valueOf(str.charAt(idx));
        String secondCharacter=String.valueOf(str.charAt(idx+1));
        if(firstCharacter.equals(secondCharacter) && !(firstCharacter.equals(" ") || secondCharacter.equals(" "))){
            return separateDuplicates(str,idx+1,newStr+firstCharacter+"*");
        }
        else{
            return separateDuplicates(str,idx+1,newStr+firstCharacter);
        }
    }
  */

}
