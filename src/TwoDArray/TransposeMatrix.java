package TwoDArray;

public class TransposeMatrix {


    public static void main(String[] args) {
            int [][] arr =
                    {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9}
                    };

        System.out.println("BEFORE");
        printArr(arr);
        System.out.println("AFTER");
        transposeMatrix(arr);
        printArr(arr);
    }


    public static void transposeMatrix(int [][] arr){
        int [][]ans = new int[arr[0].length][arr.length];
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                ans[j][i]=arr[i][j];
            }
        }
    }



    public static void printArr(int [][] arr){

        for(int[] val:arr){
            for(int temp:val){
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }

}
