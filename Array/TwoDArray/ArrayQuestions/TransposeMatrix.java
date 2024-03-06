package DSA_Java.Array.TwoDArray.ArrayQuestions;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        System.out.println("Original Matrix");
        displayArray(matrix);
        /*
            -- matrix[0].length --> gives no of columns
            -- matrix.length --> gives no of rows
            -- resultant array should have size int[columns][rows] -> because transpose
         */
        int[][] result=new int[matrix[0].length][matrix.length];
        transposeMatrix(matrix,result);

        System.out.println("Transpose Matrix");
        displayArray(result);

    }

    private static void transposeMatrix(int[][] matrix,int[][] result){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                /*
                    - We are moving to each element of given matrix like normal
                    - And when we need to update the result we just swipe the row with column to make it transpose
                 */
                result[j][i]=matrix[i][j];
            }
        }
    }

    private static void displayArray(int[][] arr){
        for(int[] a:arr){
            for(int element:a){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
