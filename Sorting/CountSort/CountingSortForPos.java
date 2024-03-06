package DSA_Java.Sorting.CountSort;

public class CountingSortForPos {

    public static int returnMax(int[] arr,int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int returnMin(int[] arr,int n){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }


    public static int[] countSort(int[] arr){
        int n=arr.length;
        int[] output=new int[n];
        int min=returnMin(arr,n);
        int max=returnMax(arr,n);

        int[] freq=new int[max+1];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        for(int i=1;i<freq.length;i++){
            freq[i]+=freq[i-1];
        }

        for(int i=0;i<n;i++){
            output[freq[arr[i]]-1]=arr[i];
            freq[arr[i]]--;
        }

        return output;
    }
    public static void main(String[] args) {
        int[] arr={0,50,23,9,28,61,61,61,1,1,0,0,32,32};
        System.out.println("Given Array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }

        System.out.println();
        int[] result=countSort(arr);

        System.out.println("After Sorting : ");
        for(int element:result){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
