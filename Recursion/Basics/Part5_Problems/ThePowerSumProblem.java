package DSA_Java.Recursion.Basics.Part5_Problems;

public class ThePowerSumProblem {

    public static int count=0;

    public static void getCombinations(int x,int n,int i){
        if(x==0) {
            count++;
            return;
        }
        if(Math.pow(i,n)>x){
            return;
        }
        getCombinations(x-(int)Math.pow(i,n),n,i+1);
        getCombinations(x,n,i+1);
    }
    public static void main(String[] args) {
        getCombinations(100,2,1);
        System.out.println(count);
    }
}
