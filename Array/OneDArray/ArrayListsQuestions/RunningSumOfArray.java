package DSA_Java.Array.OneDArray.ArrayListsQuestions;

public class RunningSumOfArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println("Basics.Array Before Running sum : ");
        displayArray(arr);
        runningSum(arr);
        System.out.println("Basics.Array After Running sum : ");
        displayArray(arr);
    }

    private static void displayArray(int[] arr){
        for(int element: arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }
    private static void runningSum(int[] arr) {
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
    }

}
