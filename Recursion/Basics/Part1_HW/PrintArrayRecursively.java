package DSA_Java.Recursion.Basics.Part1_HW;

public class PrintArrayRecursively {


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("Printing array recursively: ");
        System.out.println("Increasing order --> ");
        int n=arr.length-1;
        printArray(arr,n);
        System.out.println();
        System.out.println("Decreasing order --> ");
        printArrayDecreasing(arr,n);
    }
    /*
        In increasing order
     */
    private static void printArray(int[] arr,int idx){
        if(idx<0)return;
        printArray(arr,idx-1);
        System.out.print(arr[idx]+" ");
    }

    /*
    In decreasing order order
 */
    private static void printArrayDecreasing(int[] arr,int idx){
        if(idx<0)return;
        System.out.print(arr[idx]+" ");
        printArrayDecreasing(arr,idx-1);
    }
}
