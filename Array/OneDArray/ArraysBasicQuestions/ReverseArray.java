/*
    Reverse an array:
    - No additional array should be used
    - Time complexity should be O(N)
    - Space complexity should also be O(N)
 */

package DSA_Java.Array.OneDArray.ArraysBasicQuestions;

public class ReverseArray {

    public static void reverseArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void displayValues(int[] arr){
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {


        int[] arr= {10,20,30,40,50};
        System.out.println("Basics.Array Values Before Reversing :: ");
        displayValues(arr);
        reverseArray(arr);
        System.out.println("Basics.Array Values After Reversing :: ");
        displayValues(arr);

    }
}
