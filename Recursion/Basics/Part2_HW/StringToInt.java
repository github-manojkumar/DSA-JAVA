package DSA_Java.Recursion.Basics.Part2_HW;

public class StringToInt {
    public static void main(String[] args) {
        String str="01356";
        System.out.println("Sum of digits of "+str+" => "+stringToInt(str,str.length(),0));

    }
    private static int stringToInt(String str,int n,int idx){
        int digit=Integer.parseInt(String.valueOf(str.charAt(idx)));
        if(idx==n-1){
            return digit;
        }
        return digit*(int)Math.pow(10,n-idx-1)+stringToInt(str,n,idx+1);
    }
}
