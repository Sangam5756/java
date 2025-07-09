package TwoPointers;

public class TwoSum_2 {

//Bruetforce approach
    public static int[]  twoSumB(int arr[],int target){
//        TC = O(n^2)
            int ans[] = new int[2];
            for(int i=0;i<arr.length;i++){
                for(int j=1;j<arr.length;j++){
                    if(arr[i]+arr[j] == target){
                        ans[0]=(i)+1;
                        ans[1]=j+1;
                        break;
                    }
                }
            }
        return  ans;
    }
//    two pointer approach (Optimal)
//    tc = O(n)
    public static int[] twoSumP(int arr[],int target){
        int i=0;
        int j=arr.length-1;

        while( i <= j){
            int sum = arr[i]+arr[j];
            if(sum == target){
                return new int[]{i+1,j+1};
            }else if(sum > target){
                j--;
            }else{
                i++;
            }

        }
        return new int[]{-1,-1};

    }


    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
//        int ans[] = twoSumB(arr,9);
        int ans[] = twoSumP(arr,9);
        System.out.println(ans[0]);
        System.out.println(ans[1]);

    }
}
