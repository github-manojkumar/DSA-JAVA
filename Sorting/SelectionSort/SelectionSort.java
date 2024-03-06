package DSA_Java.Sorting.SelectionSort;

public class SelectionSort {

    public static int getMinimum(int[] arr,int start){
        int minIndex=start;
        for(int i=start+1;i<arr.length;i++){
            if(arr[i]<arr[minIndex]){
                minIndex=i;
            }
        }
        return minIndex;
    }
    public static void selectionSort(int[] arr,int n){
        for(int i=0;i<n;i++){
            int minInUnsorted=getMinimum(arr,i); //finding minimum in unsorted region
            if(minInUnsorted!=i){
                int temp=arr[i];
                arr[i]=arr[minInUnsorted];
                arr[minInUnsorted]=temp;
            }
            //swapping the minimum at the maxInSorted+1 pos
        }
    }

    public static void main(String[] args) {
        int[] arr={15,-1,3,8,2,6,4,-10,-20,7,8,9};
        System.out.println("Original Array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }
        selectionSort(arr,arr.length);
        System.out.println();
        System.out.println("Sorted Array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
