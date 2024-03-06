package DSA_Java.Recursion.Basics.Part3_HW;

/*
    n=4, n times rows and n times col or stars
    * * * *
    * * *
    * *
    *
 */

public class Pattern4 {

    public static void main(String[] args) {
        printPattern(4,0);
    }
    private static void printPattern(int n,int col){
        if(n-1<0){
            return;
        }
        if(col>n-1){
            System.out.println();
            printPattern(n-1,0);
            return;
        }
        if(col<=n-1) {
            System.out.print("* ");
        }
        printPattern(n,col+1);
    }
}
