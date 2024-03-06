package DSA_Java.Recursion.Basics.Part3_HW;
/*
    n=4, n times rows and n times col or stars
     * * * *
     * * *
     * *
     *
 */
public class Pattern6 {

    public static void printPattern(int n,int row,int col){
        if(row>n){
            return;
        }
        if(col>n-row+1){
            System.out.println();
            printPattern(n,row+1,1);
            return;
        }
        System.out.print("* ");
        printPattern(n,row,col+1);
    }
    public static void main(String[] args) {
        printPattern(6,1,1);
    }
}
