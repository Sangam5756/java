package Patterns;

public class Pattern1 {
  public static void main(String[] args) {

//    n= 4
//    *
//    **
//    ***
//    ****

            int n =4;

            for(int i=1; i<n;i++){
              for (int j = 0; j < i; j++) {
                System.out.print("*");
              }
              System.out.println();
            }

    }
}
