package DSA_Java.Recursion.Basics.Part3_HW;

public class Pattern5_Part3 {

    public static int printNextNumber(int row,int col){
        if(row==1 && col==1){
            return 1;
        }else if(row<0 || col<0 || col==row+1){
            return 0;
        }else {
            return printNextNumber(row - 1, col) + printNextNumber(row - 1, col - 1);
        }
    }

    public static void printPattern(int n,int row,int col){
        if(row>n){return;}
        if(col>row){
            System.out.println();
            printPattern(n,row+1,1);
            return;
        }else{
            System.out.print(printNextNumber(row,col)+" ");
        }

        printPattern(n,row,col+1);

    }

    public static void main(String[] args) {
        printPattern(6,1,1);
    }
}
