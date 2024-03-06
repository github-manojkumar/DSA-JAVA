package DSA_Java.Array.OneDArray.ArraysBasicQuestions;

public class MaxMinElement {

    public static int[] getMaxMin(int[] arr){
        int[] result=new int[2];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        result[0]=min;
        result[1]=max;

        return result;
    }

    public static void main(String[] args) {
        int[] arr={20,20,1,9,99,88,34, 66};
        int[] result=getMaxMin(arr);
        System.out.println("Min Value = "+result[0]);
        System.out.println("Max Value = "+result[1]);

    }
}
