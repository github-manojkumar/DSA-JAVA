package DSA_Java.Recursion.Basics.Part1_HW;

/*
    - Link : https://leetcode.com/problems/n-th-tribonacci-number/description/

    Question :  The Tribonacci sequence Tn is defined as follows:
                T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
                Given n, return the value of Tn.
 */
public class TribonacciNumber {

    int[] memo=new int[38];

    public TribonacciNumber(){
        memo[1]=1;
        memo[2]=1;
        for(int i=3;i<38;i++){
            memo[i]=-1;
        }
    }
    public int tri(int n){
        if(memo[n]!=-1){
            return memo[n];
        }
        else{
            int result=tri(n-1)+tri(n-2)+tri(n-3);
            memo[n]=result;
            return result;
        }
    }

    public static void main(String[] args) {
        TribonacciNumber tn=new TribonacciNumber();
        int n=5;
        System.out.println("Tri of n = "+n);
        System.out.println( tn.tri(n));
    }
}
