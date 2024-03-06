package DSA_Java.Sorting.InsertionSort;

public class InsertionSort {


    public static void insertionSort(int[] arr, int n){

        for(int i=1;i<n;i++){
            int currElem=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>currElem){//checking in left portion which is sorted
                arr[j+1]=arr[j];//shifting the elements
                j--;
            }
            arr[j+1]=currElem;//inserting current element at correct position
        }

    }

    public static void main(String[] args) {
        int[] arr={2,6,9,12,15,7,1,2,3,8,11,13,12};
//        int[] arr={1,2,3,4,5};
        System.out.println("Original Array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }
        insertionSort(arr,arr.length);
        System.out.println();
        System.out.println("Sorted Array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
