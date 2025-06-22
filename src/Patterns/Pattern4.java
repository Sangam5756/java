package Patterns;

public class Pattern4
    {
    public static void main(String[] args) {

            int stars =1;
            int n= 7;
            int space =n/2;

        for (int i = 1; i <= n; i++) {

           for(int j=1;j<=space; j++){
               System.out.print(" ");
           }
           for (int k=1;k<=stars;k++){
               System.out.print("*");
           }
            System.out.println();
           if( i <= n/2){
               stars+=2;
               space--;
           }else{
               stars-=2;
               space++;
           }
        }

    }
}
