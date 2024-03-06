package DSA_Java.Recursion.Basics.Part2_HW;

public class PrintingStringCount {

    /*
        - Approach 1
     */
    public static int f(int x,String pattern){
        if(x==0){
            System.out.println(pattern);
            return 1;
        }
        int count=0;
        count+=f(x-1,pattern+'0');
        if(pattern.isEmpty() || pattern.charAt(pattern.length()-1)=='0'){
            count+=f(x-1,pattern+'1');
        }
        return count;
        }

        /*
            -Approach 2 :
                for n=1 , we have count =2
                for n=2 , we have count =3
                for n=3 , we have count =5
                for n=4 , we have count =8
                for n=5 , we have count =13
                *** Similar to fibbonaci series ***
                Only difference is, here first element is 2 and second is 3
         */
    public static int countPossibility(int x){
        
        if(x==1){
            return 2;
        }
        if(x==2){
            return 3;
        }

        return countPossibility(x-1)+countPossibility(x-2);
    }

    public static void main(String[] args) {
        int x=7;
        System.out.println("Count : "+f(x,""));
        System.out.println("Count : "+countPossibility(x));
    }
}
