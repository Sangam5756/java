package Basics;

public class Finbonacci {


    public static void main(String[] args){

        int num =10;

        int a =0;
        int b=1;
        int c =0;
        while( num >0){
            c= a+b;
            a=b;
            b=c;
            num--;

        }
        System.out.println(a);


    }
}
