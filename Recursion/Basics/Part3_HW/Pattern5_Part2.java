package DSA_Java.Recursion.Basics.Part3_HW;

public class Pattern5_Part2 {
    public static void main(String[] args) {
        int n=5;
        System.out.println("1");
        printPattern(n,1,0,1);

    }
    public static int printPattern(int n,int row,int col,int count){
        if(row>=n){
            System.exit(0);
        }

        if(row==0 && col==0) {
            return 1;
        }else if (row<0 || col<0 || (col>row && count>row)) {
            return 0;
        }else if(col>row){
            System.out.println();
            return printPattern(n,row+1,0,count+1);
        } else{
            int value=printPattern(n,row-1,col-1,count)+printPattern(n,row-1,col,count);
            System.out.print(value+" ");
        }
        return printPattern(n,row,col+1,count);
    }
}
