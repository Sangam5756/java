package Basics;

import java.util.Scanner;

public class ValidTriangle  {

    public static  String IsValid(int n1,int n2, int n3){

        int sum = n1+n2+n3;
        if(sum == 180){
            return "Valid Triangle";
        }

        return "Not Valid Triangle";

    }
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        int n3 =sc.nextInt();

        System.out.println(IsValid(n1,n2,n3));


    }
}
