package DSA_Java.Sorting.HeapSort;

public class HeapSort {

    public void sort(int[] arr){
        int n=arr.length;
        //Building Max Heap
        for(int i=n/2-1;i>=0;i--){
            downHeapify(arr,n,i);
        }

        //Heap sort
        for(int i=n-1;i>=0;i--){
            //swap
            swap(arr,i,0);
            //Downheapify
            downHeapify(arr,i,0);//not removing the elements just decreasing the range
        }
    }
    public void downHeapify(int[] arr,int n,int i){
        int leftChildIdx=2*i+1;
        int rightChildIdx=2*i+2;
        int maxIdx=i;

        if(leftChildIdx<n && arr[leftChildIdx]>arr[maxIdx]){
            maxIdx=leftChildIdx;
        }
        if(rightChildIdx<n && arr[rightChildIdx]>arr[maxIdx]){
            maxIdx=rightChildIdx;
        }
        if(maxIdx!=i){
            swap(arr,i,maxIdx);
            downHeapify(arr,n,maxIdx);
        }
    }
    private void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
