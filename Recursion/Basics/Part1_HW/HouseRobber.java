package DSA_Java.Recursion.Basics.Part1_HW;

public class HouseRobber {

    public static void main(String[] args) {
        int[] arr={3,1,1,9};
        System.out.println("Maximum Robbery : ");
        System.out.println(robHouse(arr,0));
    }
    private static int robHouse(int[] arr, int idx){
        if(idx>=arr.length) {
            return 0;
        }
        /*
            - Choice 1 : Rob
            - Choice 2 : Skip
         */
        return Math.max(arr[idx]+robHouse(arr,idx+2),robHouse(arr,idx+1));
    }
}
