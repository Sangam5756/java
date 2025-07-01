package TwoDArray;

public class RotateImage {
    public static void main(String[] args) {
            int [][]arr= {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };
       int[][]ans= rotateImage(arr);
        printArr(ans);

    }

    public static int[][] rotateImage(int[][] arr){
            int row = arr.length;
            int col = arr[0].length;


        for(int i=0; i<row;i++){
                for(int j=i+1;j<col;j++){
                  swap(arr,i,j,j,i);
                }
            }

//        reverse the  row
        for(int i=0; i<row;i++){
            for(int j=0;j<col/2;j++){
                swap(arr,i,j,i,col-1-j);
            }
        }

        return arr;
    }

    public static void swap(int [][]arr,int i1,int j1,int i2,int j2){
        int temp = arr[i1][j1];
        arr[i1][j1] =arr[i2][j2];
        arr[i2][j2]=temp;
    }


    public static void printArr(int [][] arr){

        for(int[] val:arr){
            System.out.print("[");
            for(int temp:val){
                System.out.print(temp + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
