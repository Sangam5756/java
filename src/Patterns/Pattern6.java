package Patterns;

public class Pattern6 {
    public static void main(String[] args) {

        int n =7;
        int space =n-2;
        int stars = 1;

        for(int i=1; i<=n; i++){

//            stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
//            space
            for (int j=1;j<=space;j++){
                System.out.print(" ");
            }
//    stars
            int sstars=stars;
            if(i == n/2 +1){
                sstars=stars-1;
            }

            for(int j=1;j<=sstars;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i <= n/2){
                stars++;
                space-=2;
            }else{
                stars--;
                space+=2;

            }

        }


    }
}
