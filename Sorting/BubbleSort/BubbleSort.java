package DSA_Java.Sorting.BubbleSort;

public class BubbleSort {

    public static void bubbleSort(int[] arr,int n){
        boolean swapped=false; //when array is sorted no need to swap, to check tha condition
        int count=0;
        for(int j=0;j<n;j++){
            for(int i=0;i<n-j-1;i++){
                if(arr[i]>arr[i+1]){ //do the swapping
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    swapped=true;
                }
                count++;
            }
            if(!swapped){
                System.out.println(" No of iteration => "+count);
                return;
            }
        }
        System.out.println(" No of iteration => "+count);

    }

    public static void main(String[] args) {
        int[] arr={15,-1,3,8,2,6,4,-10,-20,7,8,9};
//        int[] arr={1,2,3,4,5};
        System.out.println("Original Array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }
        bubbleSort(arr,arr.length);
        System.out.println();
        System.out.println("Sorted Array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
