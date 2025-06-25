package TwoDArray;

public class TwoDarry {

    public static void printTwoDArray(int [][]arr){
        int row = arr.length;
        int col = arr[0].length;

//        for(int i=0; i< row ; i++){
//            for(int j=0; j<col ; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        for(int []val :arr){
            for(int temp :val){
                System.out.print(temp+" ");
            }
            System.out.println();
        }
    }

    public static void printJaggedArray(int [][]arr){

        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        int[][] a = new int[3][4];
        int [][] a1 = {
                {1,2},
                {3,4},
                {5,6}
        };
        printTwoDArray(a1);

        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

//        to find the number of rows
        System.out.println(a.length);
//        for the col
        System.out.println(a[0].length);

        int[][] jagged = new int[3][];
        jagged[0] = new int[3];
        jagged[1] = new int[2];
        jagged[2] = new int[4];


    }
}
