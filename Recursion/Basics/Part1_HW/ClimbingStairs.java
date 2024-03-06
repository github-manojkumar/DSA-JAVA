package DSA_Java.Recursion.Basics.Part1_HW;

public class ClimbingStairs {
    int[] memo =new int[46];
    public ClimbingStairs(){
        memo[1]=1;
        memo[2]=2;
        for(int i=3;i<46;i++){
            memo[i]=-1;
        }
    }
    public static void main(String[] args) {
        ClimbingStairs cs=new ClimbingStairs();
        int n=45;
        System.out.println("No of steps to climb "+n+" steps = "+cs.climb(n));
    }

    private int climb(int n){
        if(memo[n]!=-1){
            return memo[n];
        }else{
            int count=climb(n-1)+climb(n-2);
            memo[n]=count;
            return count;
        }
    }
}
