package DSA_Java.Searching;



/*
    - Define Search Space
    - Find the middle element
    - Take decision based on middle value
 */
public class BinarySearch {

    public static int f(int[] arr,int start,int end,int x){

        if(start==end){
            if(arr[start]==x) return start;
            else return -1;
        }

        int mid=(start+end)/2;
        if(x==arr[mid]){
            return mid;
        }else if(x<arr[mid]){
            return f(arr,start,mid-1,x);
        }else{
            return f(arr,mid+1,end,x);
        }
    }
    public static int binarySearch(int[] arr,int x){
            return f(arr,0,arr.length-1,x);
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,7,8};
        int x=6;
        int idx=binarySearch(arr,x);
        if(idx!=-1){
            System.out.println("Element Found at Pos "+(idx+1));
        }else{
            System.out.println("Element Not Found");
        }
    }
}
