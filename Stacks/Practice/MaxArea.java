package DSA_Java.Stacks.Practice;

public class MaxArea {

    public static int[] getSuffixIdx(int[] heights,int n){
        int[] suffIdx=new int[n];
        suffIdx[n-1]=n;
        for(int i=n-2;i>=0;i--){
            if(heights[i]>heights[i+1]){
                suffIdx[i]=i+1;
            }else{
                int j=i+1;
                while(j<n && heights[i]<=heights[j]){
                    j++;
                }
                suffIdx[i]=j;
            }
        }
        return suffIdx;
    }

    public static int[] getPrefixIdx(int[] heights,int n){
        int[] preIdx=new int[n];
        preIdx[0]=-1;
        for(int i=1;i<n;i++){
            if(heights[i]>heights[i-1]){
                preIdx[i]=i-1;
            }else{
                int j=i-1;
                while(j>=0 && heights[i]<=heights[j]){
                    j--;
                }
                preIdx[i]=j;
            }
        }
        return preIdx;
    }

    public static int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] suffIdx=getSuffixIdx(heights,n);
        int[] preIdx=getPrefixIdx(heights,n);
        int result=0;
        for(int i=0;i<n;i++){
            //height*(suffix-prefix-1)
            result=Math.max(result,heights[i]*(suffIdx[i]-(preIdx[i])-1));
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,1};
        System.out.println(largestRectangleArea(arr));
    }
}
