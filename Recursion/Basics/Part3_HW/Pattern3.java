package DSA_Java.Recursion.Basics.Part3_HW;

/*
    n=4, n times rows and n times col or stars
          *
        * *
      * * *
    * * * *
 */
public class Pattern3 {

    public static void main(String[] args) {
        printPattern1(4,1,1);
    }

    public static void printPattern1(int n,int row,int col){
        if(row>n){
            return;
        }
        if(col>n){
            System.out.println();
            printPattern1(n,row+1,1);
            return;
        }
        if(row+col>n) {
            System.out.print("* ");
        }else{
            System.out.print("  ");
        }

        printPattern1(n,row,col+1);
    }



    private static void printPattern(int n,int row,int col){
        if(row>n-1){
            return;
        }
        if(col>n-1){
            System.out.println();
            printPattern(n,row+1,0);
            return;
        }
        if(row+col>=n-1){
            System.out.print("* ");
        }else{
            System.out.print("  ");
        }

        printPattern(n,row,col+1);
    }
}
