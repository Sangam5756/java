package TwoDArray;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int [][] matrix1 =
                {
                        {1,2,3,4},
                        {5,6,7,8}
                };
        int[][] matrix2 = {
                {1,2},
                {3,4},
                {5,6},
                {7,8}
        };
        int [][]result =matrixMult(matrix1,matrix2);
        printArr(result);


    }

    public static void printArr(int [][] arr){

        for(int[] val:arr){
            for(int temp:val){
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }


    public static int[][] matrixMult(int[][]matrix1,int [][]matrix2){
        int col = matrix1[0].length;
        int result[][] = new int[matrix1.length][matrix2[0].length];

        for(int i=0; i<matrix1.length;i++){
            for(int j=0; j<matrix2[0].length;j++){
                int sum=0;
                for(int k=0; k<col;k++){
                    int temp = matrix1[i][k] * matrix2[k][j];
                    sum+=temp;
                }
                result[i][j] =sum;
            }
        }
    return result;

    }


}
