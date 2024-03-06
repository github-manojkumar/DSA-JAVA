// - Rotate array k times
// - Make changes in the same array

package DSA_Java.Array.OneDArray.ArraysBasicQuestions;

public class RotateArray {

    /*
        -This approach took o(N2) tc

     */
    public static void rotateArray(int k,int[] arr){
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }

        for(int i=0;i<k;i++){
            int lastValue=arr[arr.length-1];
            /*
                - Run loop in the backward direction to move all the elements one step forward
                - At last update first element with the stored lastValue
             */
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }


            arr[0]=lastValue;
        }

    }

    public static void displayValues(int[] arr){
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void rotateArrayLinear(int k, int[] arr){

        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }

        int[] res=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            res[(k+i)%arr.length]=arr[i];
        }

        /*
            - We are losing the reference of passed array when we do arr=res
            - As it is local, so it's start pointing to the new array location of res and our main arr variable values remain unchanged
            - so one solution is updating values manually
         */
        for(int i=0;i<arr.length;i++){
            arr[i]=res[i];
        }
    }

    public static void reverseArray(int start,int end, int[] arr){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotateArrayLinearSpaceTime(int k,int[] arr){

        /*
            - Setting the value of k is same as all other solutions
            - In this approach we will reverse array thrice
            - 1. from 0 to n (n-1)
            - 2. from 0 to k (k-1)
            - 3. from k to n (n-1)
            - Here TC and SC is O(N)
         */
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }

        // Rotating from 0 to n
        reverseArray(0,arr.length-1,arr);

        // Rotating from 0 to k
        reverseArray(0,k-1,arr);

        //rotating from k to n
        reverseArray(k,arr.length-1,arr);
    }

    public static void main(String[] args) {
        int k=3;
        int[] arr={10,20,30,40,50,60,70,80};
        System.out.println("Before Rotating Basics.Array values : ");
        displayValues(arr);
//        rotateArray(k,arr);  // TC = O(N2) SC= O(1)
//        rotateArrayLinear(k,arr); // TC = O(N) SC= O(N)
        rotateArrayLinearSpaceTime(k,arr); // TC = O(N) SC= O(1)
        System.out.println("After Rotating Basics.Array Values : ");
        displayValues(arr);

    }
}
