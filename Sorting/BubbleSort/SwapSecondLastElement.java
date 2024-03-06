package DSA_Java.Sorting.BubbleSort;

public class SwapSecondLastElement {
    public static void swap(int[] arr, int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    public static void swapSecondLast(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[n-1]){
                swap(arr,i,n-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={2,6,9,12,15,7};
//        int[] arr={1,2,3,4,5};
        System.out.println("Original Array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }
        swapSecondLast(arr,arr.length);
        System.out.println();
        System.out.println("Sorted Array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
