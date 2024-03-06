package DSA_Java.Recursion.Basics.Part2_HW;

/*
    Given a string of alphabets, write a function recursively that prints a new string which has all characters of S except any occurrence of 'x'
 */
public class PrintingString {

    public static void main(String[] args) {
        String str="Hxexxlxlxox";
        printStringWithoutX(str,0);

    }
    public static void printStringWithoutX(String str,int idx){
        if(idx==str.length()){
            System.out.println();
            return;
        }
//        String temp=String.valueOf(str.charAt(idx));
        if(str.charAt(idx)!='x'){
            System.out.print(str.charAt(idx));
        }
        printStringWithoutX(str,idx+1);
    }
}
