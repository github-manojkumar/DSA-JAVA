package DSA_Java.Recursion.Basics.Part4_HW;

public class SubSequence {

    public static void main(String[] args) {
        String str="123";
        getSubSequence(str,0,"");

    }

    public static void getSubSequence(String str,int idx,String output){
        if(idx>=str.length()){
            System.out.print("["+output+"]");
            return;
        }
        getSubSequence(str,idx+1,output+str.charAt(idx));
        getSubSequence(str,idx+1,output);
    }
}
