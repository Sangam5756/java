package Patterns;

public class Pattern3 {
    public static void main(String[] args) {

        int stars =1;
    int n=7;
        for(int i=1;i<=n;i++){

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if(i <= n/2){
                stars++;
            }else{
                stars--;
            }
        }

    }
}
