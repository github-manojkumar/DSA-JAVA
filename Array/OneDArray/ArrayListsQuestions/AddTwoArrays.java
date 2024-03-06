package DSA_Java.Array.OneDArray.ArrayListsQuestions;

import java.util.ArrayList;

public class AddTwoArrays {

    public static void main(String[] args) {
        int[] arr1={2,3,4};
        int[] arr2={9,9,9};
        System.out.println("Basics.Array 1 : ");
        displayArray(arr1);
        System.out.println("Basics.Array 2 : ");
        displayArray(arr2);
        System.out.println("Basics.Array Sum : ");
        System.out.println(arraySum(arr1,arr2));
    }
    private static void displayArray(int[] arr){
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }
    private static ArrayList<Integer> arraySum(int[] arr1,int[] arr2){
        ArrayList<Integer> result=new ArrayList<>();
        int carry=0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0){
                sum+=arr1[i];
            }
            if(j>=0){
                sum+=arr2[j];
            }
            int remainder=sum%10;
            carry=sum/10;
            result.add(0,remainder);
            i--;
            j--;
        }
    // Corner case if at last iteration carry is not equal to zero
        if(carry>0){
            result.add(0,carry);
        }
        return result;
    }
}
