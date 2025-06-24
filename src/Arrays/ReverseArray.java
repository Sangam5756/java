package Arrays;

public class ReverseArray {

    public static void printArr(int []arr){
        for (int val : arr){
            System.out.print(val +" ");
        }
        System.out.println();
    }

    public static void Reverse(int [] arr){
        int i=0;
        int j=arr.length-1;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
    }
    public static void main(String[] args) {
            int[] arr = {1,2,3,4,5};
            printArr(arr);
            Reverse(arr);
            printArr(arr);
    }
}
