package DSA_Java.Sorting.CountSort;

import java.util.HashMap;
import java.util.Map;

public class CountSort {


    public static void giveSortedArray(int[] arr,int n){
        Map<Integer, Integer> map =new HashMap<>();

        //Counting frequencies of particular element and also in sorted order
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max){max=arr[i];}
            if(arr[i]<min){min=arr[i];}
            map.put(arr[i],(map.getOrDefault(arr[i],0))+1);
        }
        int j=0;

        //adding keys with freq to the result array
        for(int i=min;i<=max;i++){
            if(map.containsKey(i)){
                int key=i;
                while(map.get(key)>0){
                    arr[j++]=key;
                    map.put(key, map.get(key)-1);
                }
            }
        }
    }

    public static void countSort(int[] arr){
        /**
         * This function is sorting given array using count sort algorithm which is implemented in giveSortedArray() function
         */
        giveSortedArray(arr,arr.length);
    }

    public static void main(String[] args) {
        int[] arr={50,23,9,28,61,61,61,-1,-1,0,0,32,32};
        System.out.println("Given Array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }

        System.out.println();
        countSort(arr);

        System.out.println("After Sorting : ");
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
