package DSA_Java.Searching;

public class BinarySearchUsingLoop {

    public static int binarySearch(int[] arr,int x){
        int result=-1;
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(x==arr[mid]){
                result=mid;
                break;
            }else if(x<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,7,8};
        int x=8;
        int idx=binarySearch(arr,x);
        if(idx!=-1){
            System.out.println("Element Found at Pos "+(idx+1));
        }else{
            System.out.println("Element Not Found");
        }
    }
}
