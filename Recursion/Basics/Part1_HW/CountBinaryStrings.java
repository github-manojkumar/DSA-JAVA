package DSA_Java.Recursion.Basics.Part1_HW;

public class CountBinaryStrings {

    public static void main(String[] args) {
        int n=5;
        System.out.println("Number of binary strings in n="+n+" is "+countBinStrings(n));

    }

    /*
        - Finding the pattern as in fibonacci series
            when n=1, we have 2 strings that doesn't contain consecutive 1  i.e (0 , 1)
            when n=2, we have 3 strings i.e (00,01,10)
            when n=3, we have 5 strings i.e (000,001,010,100,101)
            when n=4, we have 8 strings i.e (0000,0001,0010,0100,0101,1000,1001,1010)
         Here we can see, the series starts with n==1 -> 1 and n=2 --> 2 and the next number is sum of previous two

     */
    private static int countBinStrings(int n){
        if(n==1 || n==2) return n+1;
        return countBinStrings(n-1)+countBinStrings(n-2);
    }

}
