package DSA_Java.Array.TwoDArray.ArrayQuestions;

public class PrintingArrayInWaveFormat {
    public static void main(String[] args) {

        int[][] arr={
                {10,20,30,35},
                {40,50,60,65},
                {70,80,90,95}
        };
//        displayInWaveFormat(arr);
        displayInWaveFormatOptimized(arr);
    }

    /*
        In this approach we iterate through each column one by one and
        when column number is even -> print data in forward direction in column wise format
        when column number is odd -> print data in backward direction in column wise format
     */
    private static void displayInWaveFormatOptimized(int[][] arr){

        for(int j=0;j<arr[0].length;j++){ // Going through columns first
            if(j%2==0){
                for(int i=0;i< arr.length;i++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int i= arr.length-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }

        }
        System.out.println();

    }




    /*
        - Brute Force approach.. Based on
        1. Move down first
        2. Move one step right
        3. Move up
        4. Move right one step
        Repeat this till i and j == length of row and length of column repectively
     */
    private static void displayInWaveFormat(int[][] arr){

        int i=0;
        int j=0;
        while(i!=arr.length && j!=arr[0].length){

            // Down Move
            while(i< arr.length && j!=arr[0].length){
                System.out.print(arr[i][j]+" ");
                if(i== arr.length-1){
                    j++;
                    break;
                }else{
                    i++; // One right move at the last
                }
            }

            // Up Move
            while(i>=0 && j!= arr[0].length && i!=arr.length){
                System.out.print(arr[i][j]+" ");
                if(i==0){
                    j++;
                    break;
                }else{
                    i--; // One right move at the last
                }
            }


            if(j== arr[0].length){
                i= arr.length;
            }
        }
        System.out.println();
    }
}
