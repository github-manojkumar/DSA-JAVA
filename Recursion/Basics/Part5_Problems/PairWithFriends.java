package DSA_Java.Recursion.Basics.Part5_Problems;

public class PairWithFriends {
    public static void main(String[] args) {
        int n=5;
        System.out.println(pairUp(n));
    }

    public static int pairUp(int n){
        if(n==1 || n==2){
            return n;
        }
        return pairUp(n-1)+pairUp(n-2)*(n-1);
    }
}
