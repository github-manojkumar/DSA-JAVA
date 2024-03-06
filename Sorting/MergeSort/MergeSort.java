package DSA_Java.Sorting.MergeSort;

public class MergeSort {

    public static int[] mergeTwoSortedArrays(int[] left,int[] right){
        int n=left.length;
        int m=right.length;
        int[] result=new int[m+n];
        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m){
            if(left[i]<right[j]){
                result[k++]=left[i++];
            }else{
                result[k++]=right[j++];
            }
        }
        while(i<n){
            result[k++]=left[i++];
        }
        while(j<m){
            result[k++]=right[j++];
        }
        return result;
    }

    public static void merge(int[] arr,int start,int mid,int end){
        int[] left=new int[mid-start+1];
        int[] right=new int[end-mid];
        int k=0;
        for(int i=start;i<=mid;i++){
            left[k++]=arr[i];
        }
        k=0;
        for(int i=mid+1;i<=end;i++){
            right[k++]=arr[i];
        }

        //two arrays created

        int[] result=mergeTwoSortedArrays(left,right);
        k=0;
        for(int i=start;i<=end;i++){
            arr[i]=result[k++];
        }
    }

    public static void mergeRecursive(int[] arr, int start, int end){
        if(start>=end){return;}
        int mid=(start+end)/2;
        mergeRecursive(arr,start,mid);
        mergeRecursive(arr,mid+1,end);
        merge(arr,start,mid,end);
    }


    public static void mergeSort(int[] arr){
        mergeRecursive(arr,0,arr.length-1);
    }
    public static void main(String[] args) {
        int[] arr={15,-1,3,8,2,6,4,-10,-20,7,8,9};
        System.out.println("Original Array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
        mergeSort(arr);
        System.out.println();
        System.out.println("Sorted Array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
