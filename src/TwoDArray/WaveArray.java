package TwoDArray;

public class WaveArray {

        public static void main(String[] args) {
            int [][] arr = {
                    {1,2},
                    {3,4}
            };
            printWaveArray(arr);

    }

    public static void printWaveArray(int [][]arr){

            for(int c=0; c<arr[0].length;c++){

//                if even move down
                if( c %2 == 0){
                    for(int r=0;r<arr.length;r++){
                        System.out.print(arr[r][c]+" ");
                    }
                }else{
                    for(int r=arr.length-1;r>=0;r--) {
                        System.out.print(arr[r][c] + " ");
                    }
                    }
            }}

}
