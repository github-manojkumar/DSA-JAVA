package DSA_Java.Recursion.Basics.Part3_HW;

import java.util.Scanner;

public class Problem4 {
    public static int giveIndexOfM(int[] arr,int idx,int m){
        if(idx>=arr.length){
            return m;
        }
        if(arr[idx]==m){
            m=idx;
        }
        return giveIndexOfM(arr,idx+1,m);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();
        sc.nextLine();
        int[] arr=new int[size];
        System.out.println("Enter the elements of array space separated");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the value M : ");
        int m= sc.nextInt();
        System.out.println("Found m = "+m +" at index => "+giveIndexOfM(arr,0,m));
        sc.close();
    }
}
