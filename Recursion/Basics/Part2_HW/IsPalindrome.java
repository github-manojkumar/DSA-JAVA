package DSA_Java.Recursion.Basics.Part2_HW;

public class IsPalindrome {
    public static void main(String[] args) {
        String str="1087";
        System.out.println("Given string : "+str);
        System.out.println("Is string "+str+" Palindrome => "+isPalindrome(str));
        /*
            - Approach 2
         */
        System.out.println("Approach 2 ");
        System.out.println("Given string : "+str);
        System.out.println("Is string "+str+" Palindrome => "+isPalindromeString(str,0,str.length()-1));
    }

    /*
        Approach 2 : Two pointers type
        TC O(N)
        SC O(1)
     */

    private static boolean isPalindromeString(String str,int start,int end){

        if(start==end) return true;
        if(str.charAt(start)!=str.charAt(end)) return false;
        if(start<end-1){
            return isPalindromeString(str,start+1,end-1);
        }
        return true;
    }

    /*
        - Approach 1 by reversing the string
        TC O(N)
        SC O(N)
     */
    private static boolean isPalindrome(String str){
        String newString=palindromeCheck(str,0);
        System.out.println("Reversed String -> "+newString);
        return newString.equals(str);
    }
    private static String palindromeCheck(String str,int idx){
        String currentCharacter=String.valueOf(str.charAt(idx));
        if(idx==str.length()-1){
            return currentCharacter;
        }
        return palindromeCheck(str,idx+1)+currentCharacter;
    }
}
