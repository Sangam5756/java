package Patterns;

public class Pattern2 {
    public static void main(String[] args) {
//        n =3
//        __*
//        _***
//        *****
        int n =3;

        for(int i=1; i<=n;i++){
//          space
            for(int space =n-i;space>=0;space--){
                System.out.print(" ");
            }
//            stars
            for(int j=i;j<(i*3)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
