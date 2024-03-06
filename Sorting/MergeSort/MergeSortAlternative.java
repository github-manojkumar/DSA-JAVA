package DSA_Java.Sorting.MergeSort;

public class MergeSortAlternative {

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
    public static int[] mergeRecursive(int[] arr,int start,int end){
        if(start==end){
            return new int[]{arr[start]};
        }

        int mid=(start+end)/2;
        int[] left=mergeRecursive(arr,start,mid);
        int[] right=mergeRecursive(arr,mid+1,end);
        return mergeTwoSortedArrays(left,right);
    }

    public static void mergeSort(int[] arr){
        int[] result=mergeRecursive(arr,0,arr.length-1);
        int k=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=result[k++];
        }
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
