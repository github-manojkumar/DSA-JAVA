package DSA_Java.Recursion.Basics.Part3_HW;

/*
    n=6, n times rows and n times col or stars
    1
    1  1
    1  2  1
    1  3  3  1
    1  4  6  4  1
    1  5 10 10  5  1

 */
public class Pattern5 {
    public static void main(String[] args) {
        int n=4;
        printPattern(n,0,0);
    }
    public static void printPattern(int n,int row,int col){
        if(row>=n){
            return;
        }
        if(col>row){
            System.out.println();
            printPattern(n,row+1,0);
            return;
        }else{
            System.out.print(nextNumber(row,col)+" ");
        }
        printPattern(n,row,col+1);
    }
    public static int nextNumber(int row,int col){
        if(row==0 && col==0) {
            return 1;
        }else if(row<0 || col<0 || col==row+1){
            return 0;
        }else {
            return nextNumber(row - 1, col) + nextNumber(row - 1, col - 1);
        }
    }

}
