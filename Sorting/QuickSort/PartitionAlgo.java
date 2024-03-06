package DSA_Java.Sorting.QuickSort;

public class PartitionAlgo {

    public static void swapElements(int[] arr,int low,int high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }

    public static void partitionAlgo(int[] arr,int l,int r,int pivotIdx){
        int pivotElem=arr[pivotIdx];
        int m=l;
        swapElements(arr,r,pivotIdx);
        for(int i=l;i<=r-1;i++){
            if(arr[i]<pivotElem){
                swapElements(arr,m,i);
                m++;
            }
        }

        swapElements(arr,r,m);
    }

    public static void main(String[] args) {
        int[] arr={50,23,9,28,61,32};
        System.out.println("Given Array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }

        System.out.println();
        int pivotIdx=arr.length/2;
        partitionAlgo(arr,0,arr.length-1,pivotIdx);
        System.out.println("Array after partition Algorithm :");
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
