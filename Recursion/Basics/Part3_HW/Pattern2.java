package DSA_Java.Recursion.Basics.Part3_HW;

/*
    n=4, n times rows and n times col or stars
    *
    * *
    * * *
    * * * *
 */

public class Pattern2 {
    public static void main(String[] args) {
        printPattern(4,1,1);
    }
    private static void printPattern(int n,int row,int col){
        if(row>n){
            return;
        }
        if(col>row){
            System.out.println();
            printPattern(n,row+1,1);
            return;
        }
        System.out.print("* ");
        printPattern(n,row,col+1);
    }
}
