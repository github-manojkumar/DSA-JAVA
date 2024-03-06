package DSA_Java.Sorting.MergeSort;

public class InversionPairProblem {
    static int count=0;

    public static int[] sort(int[] left,int[] right){
        int n=left.length;
        int m=right.length;
        int[] result=new int[n+m];
        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m){
            if(left[i]<right[j]){
                result[k++]=left[i++];
            }else{
                result[k++]=right[j++];
                count+=n-i;
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
    public static int[] merge(int[] arr,int start,int end){
        if(start==end){
            return new int[]{arr[start]};
        }
        int mid=(start+end)/2;
        int[] left=merge(arr,start,mid);
        int[] right=merge(arr,mid+1,end);
        return sort(left,right);
    }

    public static int inversionPair(int[] arr){
        merge(arr,0,arr.length-1);
        return count;
    }

    public static void main(String[] args) {
        int[] arr={2,3,8,6,1};
        System.out.println("Original Array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println("No. of pairs : "+inversionPair(arr));
    }
}
