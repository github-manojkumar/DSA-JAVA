package DSA_Java.Recursion.Basics.Part3_HW;

/*
    n=4, n times rows and n times col or stars
    * * * *
    * * * *
    * * * *
    * * * *
 */
public class Pattern1 {

    public static void main(String[] args) {
        int n=6;
        genPatter(1,1,n);
//        generatePatter(n,n);
    }


    /*
        Approach 2 : Single recursive function
     */

    private static void genPatter(int row,int col,int n){
        if(row>n)return;
        if(col>n){
            System.out.println();
            genPatter(row+1,1,n);
            return;
        }
        System.out.print("* ");
        genPatter(row,col+1,n);
    }

    /*
         Approach 1 : two recursive function
     */
    private static void printPattern(int n){
        if(n==0) return;
        System.out.print("* ");
        printPattern(n-1);
    }
    private static void generatePatter(int n,int totalStars){
        if(n==0) return;
        printPattern(totalStars);
        System.out.println();
        generatePatter(n-1,totalStars);
    }
}
