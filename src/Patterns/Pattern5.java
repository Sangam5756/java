package Patterns;

public class Pattern5
{
    public static void main(String[] args) {

        int n=7;

        for(int fRow=1; fRow<(n*2)-1; fRow++ ){
            System.out.print("*");
        }
        System.out.println();
        n = n-1;
        int stars =n-1;
        int space=1;

        for(int i=1; i<=n;i++){

            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }

            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }


            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            stars--;
            space +=2;
        }

    }
}
