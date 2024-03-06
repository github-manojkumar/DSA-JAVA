package DSA_Java.Recursion.Basics.Part5_Problems;

public class FibbonacciSeries {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++){
            System.out.println(printSeries(i));
        }
    }

    public static int printSeries(int n){
        if(n==0 || n==1 ){
            return n;
        }
        return printSeries(n-1)+printSeries(n-2);
    }
}
