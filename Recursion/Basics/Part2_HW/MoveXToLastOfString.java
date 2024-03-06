package DSA_Java.Recursion.Basics.Part2_HW;

public class MoveXToLastOfString {

    public static void main(String[] args) {
        String str="xaxbxc";
        System.out.println(moveXtoLast(str,0));

    }

    private static String moveXtoLast(String str,int idx){
        if(idx==str.length()-1){
            return str;
        }
        char currentChar=str.charAt(idx);
        if(currentChar=='x'){
            str=swapStringRecursively(str.toCharArray(),idx,str.length()-1,currentChar);
        }
        return moveXtoLast(str,idx+1);
    }

    private static String swapStringRecursively(char[] arr,int start,int end,char temp){
        if(start>=end){
            arr[end]=temp;
            return String.valueOf(arr);
        }
        arr[start]=arr[start+1];
        return swapStringRecursively(arr,start+1,end,temp);
    }


    /*
        - Iteratively swapping
     */

    /*
        private static String swapString(String str,int start,int end){
            char[] arr=str.toCharArray();
            char temp=arr[start];
            for(int i=start;i<str.length()-1;i++){
                arr[i]=arr[i+1];
            }
            arr[end]=temp;
            return String.valueOf(arr);
        }
    */
}
