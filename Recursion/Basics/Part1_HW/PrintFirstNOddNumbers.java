package DSA_Java.Recursion.Basics.Part1_HW;

public class PrintFirstNOddNumbers {

    /*
        - Print first n odd numbers in decreasing order
     */
    private static void printFirstNOddNumbers(int n){
        if(n<1){return;}
        if(n%2!=0){ System.out.print(n+" ");}
        printFirstNOddNumbers(n-1);
        if(n%2==0){ System.out.print(n+" ");}
    }

    /*
    - Print first n odd numbers in increasing order
    */
//    private static void printFirstNEvenNumbers(int n,int value){
//        if(value>=n){return;}
//        if(value%2==0){ System.out.print(value+" ");}
//       printFirstNEvenNumbers(n,value+1);
//    }
    public static void main(String[] args) {
        int n=6;
        printFirstNOddNumbers(n-1);
//        printFirstNEvenNumbers(n,1);
    }
}
