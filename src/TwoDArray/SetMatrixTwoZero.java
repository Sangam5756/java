package TwoDArray;

public class SetMatrixTwoZero {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        printArr(arr);
        setMatrixZero(arr);
        printArr(arr);
    }

    public static void setMatrixZero(int[][]arr){

        int m = arr.length;
        int n = arr[0].length;
        boolean isRow = false;
        boolean isCol = false;
        for(int i=0; i< m ; i++){
            for(int j=0; j<n;j++){
                if(arr[i][j] == 0){
                    arr[i][0] =0;
                    arr[0][j]=0;
                    if(i==0) isRow =true;
                    if(j==0) isCol=true;
                }
            }
        }

        for(int i=1;i<m;i++){
            for(int j=1; j<n; j++){
                if(arr[i][0] == 0 || arr[0][j] == 0){
                    arr[i][j]=0;
                }
            }
        }

        if(isRow){
            for(int i=0; i<n;i++){
                arr[i][0]=0;
            }
        }
        if(isCol){
            for(int i=0; i<m;i++){
                arr[0][i]=0;
            }
        }

    }

    public static void printArr(int[][]arr){

        for(int[] val:arr){
            for(int temp:val){
                System.out.print(temp +"");
            }
            System.out.println();
        }
    }
}
