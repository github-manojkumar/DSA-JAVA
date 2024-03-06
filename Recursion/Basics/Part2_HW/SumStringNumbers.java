package DSA_Java.Recursion.Basics.Part2_HW;

/*
    Que 1:
    Take an input string containing numbers, return the sum of the digits of the string recursively
 */
public class SumStringNumbers {
    public static void main(String[] args) {
        String str="1234567984847477373737373737";
        System.out.println("Sum of digits of "+str+" => "+getSum(str,0));

    }
    private static int getSum(String str,int idx){
        if(idx==str.length()-1){
            return str.charAt(idx)-'0';
        }
        return str.charAt(idx)-'0'+getSum(str,idx+1);
    }
}
