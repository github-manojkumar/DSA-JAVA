package DSA_Java.Array.OneDArray.ArrayListsQuestions;

import java.util.ArrayList;

public class IntersectionOfArray {

    public static ArrayList<Integer> intersection(int[] arr1,int[] arr2){
        ArrayList<Integer> result = new ArrayList<>();

        int i=0;
        int j=0;
        int index=0;
        while(i<arr1.length && j<arr2.length){

            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]) {
                j++;
            }else{
                if(index==0){
                    result.add(arr1[i]);
                    index++;
                }
                else if(index>0 && result.get(index-1)!=arr1[i]){
                    result.add(arr1[i]);
                    index++;
                }
                i++;
                j++;

            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1={10,20,20,30,30,30,34,35,36,40,40,45};
        int[] arr2={12,15,16,17,20,23,30,30,30,40,40,48,50};

        System.out.println("Intersection : "+intersection(arr1,arr2));


    }
}
