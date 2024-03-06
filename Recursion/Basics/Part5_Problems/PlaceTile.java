package DSA_Java.Recursion.Basics.Part5_Problems;

public class PlaceTile {

    public static void main(String[] args) {
        int n= 5;
        System.out.println(placeTile(n));
    }

    public static int placeTile(int n){
        //vertical case
       if(n<1) return 0;
       if(n==1) return 1;
        return placeTile(n-1)+placeTile(n-2);
    }
}
