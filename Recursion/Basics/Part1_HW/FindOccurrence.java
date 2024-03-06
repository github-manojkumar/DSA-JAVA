package DSA_Java.Recursion.Basics.Part1_HW;

public class FindOccurrence {
    public static void main(String[] args) {
        int[] arr={4,6,7,8};
        int x=8;
        int result=findOccurrence(arr,0,x);
        if(result!=-1) System.out.println("Element x "+x+" found at idx : "+result);
        else System.out.println("Element x "+x+" not found ");
    }

    private static int findOccurrence(int[] arr,int idx,int x){
        if(idx==arr.length)return -1;
        return (arr[idx]==x)?idx:findOccurrence(arr,idx+1,x);
    }
}
