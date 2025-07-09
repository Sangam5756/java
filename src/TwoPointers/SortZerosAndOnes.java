package TwoPointers;

public class SortZerosAndOnes {

    public static void sortZerosAndOnes(int arr[]){

        int i=0;
        int j= arr.length-1;

        while(i < j){
            if( arr[i] == 0){
                i++;
            }else{
                swap(arr,i,j);
                j--;
            }
        }
//        return arr;
    }
    public static void swap(int[]arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {

        int []arr ={0,0,1,0,0,1,0,1,1,0};
        sortZerosAndOnes(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
