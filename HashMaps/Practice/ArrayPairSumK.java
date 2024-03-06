package DSA_Java.HashMaps.Practice;

import java.util.HashSet;
import java.util.Set;

public class ArrayPairSumK {

    public static boolean canPair(int[] nums, int k) {

        int n=nums.length;

        if(n%2!=0){
            return false;
        }

        Set<Integer> set=new HashSet<>();

        for(int num:nums){
            int rem1=num%k;
            int rem2=k-rem1;
            if(set.contains(rem2)){
                set.remove(rem2);
            }
            else if(rem1==0 && set.contains(0)){
                set.remove(0);
            }
            else{
                set.add(rem1);
            }
        }
        return set.isEmpty();
    }


    public static void main(String[] args) {
        int[] arr={9,7,5,3};
        int k=6;
        System.out.println(canPair(arr,k));
    }
}
