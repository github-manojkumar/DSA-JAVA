package DSA_Java.Array.TwoDArray.ArrayQuestions;

public class MatrixMultiplication {

    public static void main(String[] args) {
        int[][] matrix1={
                {1,2,3},
                {4,5,6}
        };
        int[][] matrix2={
                {1,1},
                {1,2},
                {2,1}
        };

        /*
            Initialization :
         */
        int row1=matrix1.length;
        int row2=matrix2.length;
        int col1=matrix1[0].length;
        int col2=matrix2[0].length;
        if(col1==row2){
            int[][] result=new int[row1][col2];
            matrixMultiplication(matrix1,matrix2,result);
            System.out.println("Matrix1 : ");
            displayArray(matrix1);
            System.out.println("Multiplication ---> ");
            System.out.println("Matrix2 : ");
            displayArray(matrix2);
            System.out.println("Result ---> ");
            displayArray(result);
        }

    }

    private static void matrixMultiplication(int[][] matrix1,int[][] matrix2, int[][] result){

        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix2[0].length;j++){
                int sum=0;
                for(int k=0;k<matrix1[0].length;k++){
                   int temp=matrix1[i][k]*matrix2[k][j];
                   sum+=temp;
                }
                result[i][j]=sum;
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
