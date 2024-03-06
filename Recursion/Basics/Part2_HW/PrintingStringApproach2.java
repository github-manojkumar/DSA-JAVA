package DSA_Java.Recursion.Basics.Part2_HW;

public class PrintingStringApproach2 {

    public static void main(String[] args) {
        String str="Hxexxlxlxox";
       printStringWithoutX(str,0,"");

    }
    public static void printStringWithoutX(String str,int idx,String output){
        if(idx==str.length()){
            System.out.println(output);
            return;
        }
//        String temp=String.valueOf(str.charAt(idx));
        if(str.charAt(idx)!='x'){
            printStringWithoutX(str,idx+1,output+str.charAt(idx));
        }else {
            printStringWithoutX(str, idx + 1, output);
        }
    }
}
