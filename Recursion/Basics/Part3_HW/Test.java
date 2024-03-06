package DSA_Java.Recursion.Basics.Part3_HW;

public class Test {


    public static int maxProfit(int[] prices) {
        int lsf=Integer.MAX_VALUE;//least so far
        int tp=0;//total profit
        int op=0;//op profit
        int pist=0;//profit if sold today
        for(int i=0;i<prices.length;i++){
            if(prices[i]<lsf){
                lsf=prices[i];
            }
            pist=prices[i]-lsf;
            if(pist>op){
                op=pist;
            }else{
                tp+=op;
                op=0;
                lsf=prices[i];
            }
        }
        if(op!=0){
            tp+=op;
        }
        return tp;
    }

    public static void main(String[] args) {
      int[] prices={7,1,5,3,6,4};
      int[] prices1={6,5,4,3,2,1};
      int[] prices2={1,2,3,4,5};
        System.out.println("Profit = "+maxProfit(prices));
        System.out.println("Profit = "+maxProfit(prices1));
        System.out.println("Profit = "+maxProfit(prices2));

    }
}
