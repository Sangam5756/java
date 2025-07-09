package TwoPointers;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,2,3,3,4};
        int n=arr.length-1;
        int i=0;
        int j=i+1;
        while( i<n && j<n-2){
            if(i<n && j<n && arr[i] !=arr[j]){
                i++;
                arr[i]=arr[j];
            }
            j++;
        }

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }

        System.out.println(i+1);
    }
}
