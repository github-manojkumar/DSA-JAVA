package DSA_Java.Sorting.HeapSort;

public class TestHeapSort {
    public static void main(String[] args) {
        int[] arr={8,76,5,12,52,4,3,55};
        for(int elem:arr){
            System.out.print(elem+" ");
        }
        System.out.println();
        HeapSort h=new HeapSort();
        h.sort(arr);
        for(int elem:arr){
            System.out.print(elem+" ");
        }
        System.out.println();
    }
}
