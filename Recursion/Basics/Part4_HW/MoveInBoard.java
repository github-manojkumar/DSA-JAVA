package DSA_Java.Recursion.Basics.Part4_HW;

import java.util.HashMap;
import java.util.Map;

public class MoveInBoard {
    public static Map<String,Integer> map=new HashMap<String,Integer>();
    public static void main(String[] args) {
        int m=3; //rows
        int n=3; //cols
        System.out.println(countWays(m,n,0,0,""));
    }

    public static int countWays(int m,int n,int i,int j,String output){
        if(i==m-1 && j==n-1) {
            System.out.println(output);
            return 1;
        }

        if(i>m || j>n) return 0;
//        String cell=new String(m+","+n);
//        if(map.containsKey(cell)){
//            return map.get(cell);
//        }

        int downMove=countWays(m,n,i+1,j,output+"D");
        int rightMove=countWays(m,n,i,j+1,output+"R");
//        map.put(cell,downMove+rightMove);
//        System.out.println(output);
        return downMove+rightMove;
    }
}
