package Basics;

public class MaxOfThree {

    public static int max(int n1,int n2, int n3){

        if( n1 < n2 && n1 <n3){
            return n1;
        } else if (n2 < n3 && n2 < n1) {
            return n2;

        }else {
            return n3;
        }


    }


        public static void main(String[] args){
            System.out.println(max(2322,222,3433));
        }

}
