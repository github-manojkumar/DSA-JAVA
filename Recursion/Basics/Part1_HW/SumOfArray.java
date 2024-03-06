package DSA_Java.Recursion.Basics.Part1_HW;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("Sum Of Array : ");
        System.out.println(getSum(arr,0));
    }

    private static int getSum(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        return arr[idx]+getSum(arr,idx+1);
    }
}
