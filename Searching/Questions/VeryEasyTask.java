package DSA_Java.Searching.Questions;

public class VeryEasyTask {

    /*
        - Brute force approach, I don't know whether this will pass all test cases or not
     */

    public static int calculateTotalTime(int n,int x,int y){
        int minTimeRequired=Math.min(x,y); //we have only one copy with us, so first time only one printer can print
        int i=1;//tracking time, at one sec, how many sheets will these two printer prints
        while(n>1){ //first sheet is printed by printer x or y whichever is min, so n>1
            if(i%x==0){n--;} //if i is a multiple of x, means one sheet printed
            if(i%y==0){n--;}//if i is a multiple of y, means one sheet printed
            minTimeRequired+=1;
            i++;
        }
        return minTimeRequired;
    }

    /*
        - Optimized approach using binary search algorithm
        - We will first create the search space , min time req to make 0 copy -> max time to make n copy
        - max time we need is calculated when, we use only copier which takes more time to make a single copy
                    : i.e. range => 0 to Math.max(x,y)
        - Now we will check at every mid-point whether this much of time is enough or not
                    : if enough we will reduce the search space to right = mid-1;
                    : if not enough we will increase the search space to left=mid;
     */
    public static boolean good(int n,int x,int y,int mid){
        return (mid/x)+(mid/y)>=n-1;
    }
    public static int minTimeRequired(int n,int x,int y){
        if(n==1){
            return Math.min(x,y);
        }
        int left=0;
        int right=Math.max(x,y)*n;
        int ans=0;

        while(left<=right){
            int mid=(left+right)/2;
            if(good(n,x,y,mid)){
                right=mid-1;
                ans=mid;
            }else{
                left=mid+1;
            }
        }
        return ans+Math.min(x,y);
    }

    public static void main(String[] args) {
        int n=5808800;
        int x=5;
        int y=15;
        System.out.println("Min Time Required : "+minTimeRequired(n,x,y));
        System.out.println("Min Time Required : "+calculateTotalTime(n,x,y));
    }
}
