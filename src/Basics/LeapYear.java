package Basics;

public class LeapYear   {

    public static boolean isLeap(int year){

        if( year % 4 == 0 && year % 100 != 0){
            return true;
        } else return year % 400 == 0;



    }


    public static  void main(String[] args){
        System.out.println(  isLeap(2028));

    }
}
