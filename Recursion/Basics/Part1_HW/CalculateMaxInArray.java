package DSA_Java.Recursion.Basics.Part1_HW;

public class CalculateMaxInArray {

    public static void main(String[] args) {
        int[] arr={117,87,1,2,3,4,5,89,36,118};
        System.out.println("Max Element : ");
        System.out.println(maxElement(arr,0));
    }

    private static int maxElement(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        return Math.max(arr[idx],maxElement(arr,idx+1));
    }
}
