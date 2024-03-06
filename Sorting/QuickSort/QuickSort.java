package DSA_Java.Sorting.QuickSort;

public class QuickSort {
    public static void swapElements(int[] arr,int low,int high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }

    public static int partitionAlgo(int[] arr,int l,int r,int pi){
        int pivotElem=arr[pi];
        int m=l;
        swapElements(arr,r,pi); //moving pivot to the last element
        for(int i=l;i<=r-1;i++){
            if(arr[i]<pivotElem){
                swapElements(arr,m,i);
                m++;
            }
        }
        swapElements(arr,r,m); //moving pivot back to its position
        return m;
    }
    public static int getRandom(int l,int r){
        return (int)((Math.random()*(r-l))+l);
    }
    public static void f(int[] arr,int l,int r){
        if(l>r){
            return;
        }
        int pi=getRandom(l,r);
        int x=partitionAlgo(arr,l,r,pi);
        f(arr,l,x-1);
        f(arr,x+1,r);
    }

    public static void quickSort(int[] arr){
        f(arr,0,arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr={50,23,9,28,61,32};
        System.out.println("Given Array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }

        System.out.println();
        quickSort(arr);
        System.out.println("Array after Quick Sort Algorithm :");
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
