package DSA_Java.BackTracking;

public class PrintPermutations {

    public static  void printPermutationRecursive(String str,  String output){
        if(str.isEmpty()){
            System.out.println(output);
            return;
        }
        for(int i=0;i<str.length();i++){
            String updatedString=str.substring(0,i)+str.substring(i+1); //this line is important
            printPermutationRecursive(updatedString,output+str.charAt(i));
        }
    }

    public static String swap(String str,int i,int j){
        char[] givenStr=str.toCharArray();
        char temp=givenStr[i];
        givenStr[i]=givenStr[j];
        givenStr[j]=temp;
        return String.valueOf(givenStr);
    }


    public static void printPermutationBacktracking(String str,int left,int right){
        if(left==right){
            System.out.println(str);
        }else{
            for(int i=left;i<=right;i++){
                //do
                str=swap(str,left,i);
                //recursive part
                printPermutationBacktracking(str,left+1,right);
                //undo part
                str=swap(str,left,i);
            }
        }

    }



    public static void main(String[] args) {
        String str="abc";
        printPermutationRecursive(str,"");
        System.out.println("******************");
        printPermutationBacktracking(str,0,str.length()-1);
    }
}
