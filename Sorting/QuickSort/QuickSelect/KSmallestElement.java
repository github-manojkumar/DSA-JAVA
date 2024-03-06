package DSA_Java.Sorting.QuickSort.QuickSelect;

public class KSmallestElement {

    public static void swapElements(int[] arr,int low,int high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }

    public static int partitionAlgo(int[] arr,int l,int r,int pi){
        int pivotElem=arr[pi];
        int m=l;
        swapElements(arr,r,pi);
        for(int i=l;i<=r-1;i++){
            if(arr[i]<pivotElem){
                swapElements(arr,m,i);
                m++;
            }
        }
        swapElements(arr,r,m);
        return m;
    }
    public static int getRandom(int l,int r){
        return (int)((Math.random()*(r-l))+l);
    }
    public static int f(int[] arr,int l,int r,int k){
        int pi=getRandom(l,r);
        int m=partitionAlgo(arr,l,r,pi);
        if(k==m){
            return arr[k];
        }else if(k<m){
            return f(arr,l,m-1,k);
        }else{
//            return f(arr,m+1,r,(k-(m+1)));//not required as we are processing data in array
            return f(arr,m+1,r,k);
        }
    }

    public static int quickSelect(int[] arr,int k){
        if(k>=arr.length) {
            return -1;
        }
        return f(arr,0,arr.length-1,k);
    }

    public static void main(String[] args) {
        int[] arr={9,2,1,10,9,3,8};
        int k=5;
        System.out.println("Given Array : ");
        for(int element:arr){
            System.out.print(element+" ");
        }

        System.out.println();
        int result=quickSelect(arr,k);
        System.out.println("Kth Samllest element :"+result);
        System.out.println("Array after sorting");
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
