package DSA_Java.Recursion.Basics;

public class Test {
    int[] arr={1,2,3,3,3,4,4,4,5};
    public static int removeDuplicates(int[] nums) {
        int i = 0; // Pointer for modifying the array in place
        for (int n : nums) { // Loop through each element in nums
            if (i < 2 || n > nums[i - 2]) { // Check conditions for including the element
                nums[i++] = n; // If conditions are met, include the element in the modified array
            }
        }
        return i;
    }

    public static void main(String[] args) {
       Test t=new Test();
       removeDuplicates(t.arr);
       for(int element:t.arr){
           System.out.print(element+" ");
       }
    }
}
