package DSA_Java.Sorting;

public class Practice {

    public static int[] merge(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int[] result=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                result[k++]=arr1[i++];
            }else{
                result[k++]=arr2[j++];
            }
        }
        while(i<n){
            result[k++]=arr1[i++];
        }
        while(j<m){
            result[k++]=arr2[j++];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,5,6,9,12};
        int[] arr2={3,4,5,9,15,18,20,22};
        int[] result=merge(arr1,arr2);
        for(int element:result){
            System.out.print(element+" ");
        }

    }
}
