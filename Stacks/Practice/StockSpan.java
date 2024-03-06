package DSA_Java.Stacks.Practice;

import java.util.ArrayList;


public class StockSpan {
    static ArrayList<Integer> stockPrice=new ArrayList<>();

    public static int next(int price) {
        int size=stockPrice.size();
        stockPrice.add(price);
        int count=0;
        while(size>=0 && stockPrice.get(size)<=price){
            count++;
            size--;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(next(10));
        System.out.println(next(20));
        System.out.println(next(5));
        System.out.println(next(30));
    }
}
