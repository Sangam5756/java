package Arrays;

public class Rotate {


    public static void printArr(int []arr){
        for (int val : arr){
            System.out.print(val +" ");
        }
        System.out.println();
    }

    public static void rotatearray(int []arr,int k){

         k= k% arr.length;
         if(k<0){
             k+=arr.length;
         }
         for(int i=0;i<k;i++){
                int last =arr[arr.length-1];
                for(int j=arr.length-1;j>0;j--){
                    arr[j] =arr[j-1];
                }
                arr[0]=last;
         }

    }


    public static void Reverse(int [] arr,int start,int end){
        int i=start;
        int j=end;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k=3;
//        printArr(arr);
//        rotatearray(arr,k);
//        printArr(arr);
        int n=arr.length;
        Reverse(arr,0,n-1);
        Reverse(arr,0,k-1);
        Reverse(arr,k,n-1);
        printArr(arr);
    }
}
