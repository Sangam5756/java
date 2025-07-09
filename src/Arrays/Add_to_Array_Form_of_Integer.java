package Arrays;

public class Add_to_Array_Form_of_Integer {
    public static void main(String[] args) {
        int k =34;
        int count =countDigit(k)   ;
        System.out.println(count);
        int[] arr = convertArray(k,count);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] convertArray (int k,int count){
        int []arr = new int[count];
        for(int i=count-1;i>=0;i--){
            int last = k%10;
            arr[i]=last;
            k/=10;
        }
        return arr;

    }

    public static int countDigit(int k){
        int count =0;
        while(k >0){
            int last = k %10;
            count++;
            k/=10;
        }
        return count;
    }
}
