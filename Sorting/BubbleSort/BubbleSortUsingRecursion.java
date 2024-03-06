package DSA_Java.Sorting.BubbleSort;

public class BubbleSortUsingRecursion {

    public static void bubbleSort(int[] arr,int n,int idx){
        if(idx==n-1) {
            return;
        }
        if(arr[idx]>arr[idx+1]){

            int temp=arr[idx];
            arr[idx]=arr[idx+1];
            arr[idx+1]=temp;
        }
        bubbleSort(arr,n,idx+1);
    }

    public static void bubbleSortRecursive(int[] arr,int n){

        for(int i=0;i<arr.length-1;i++) {
            bubbleSort(arr, n - i, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr={15,-1,3,8,2,6,4,-10,-20,7,8,9};
//        int[] arr={1,2,3,4,5};
        System.out.println("Original Array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }
        bubbleSortRecursive(arr,arr.length);
        System.out.println();
        System.out.println("Sorted Array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }

    }
}
