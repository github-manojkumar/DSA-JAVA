package DSA_Java.Searching;

public class LinearSearch {

    public static int linearSearch(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr={1,6,8,3,2,0,9};
        int x=0;
        int idx=linearSearch(arr,x);
        if(x!=-1){
            System.out.println("Element Found at Pos "+(idx+1));
        }else{
            System.out.println("Element Not Found");
        }
    }
}
