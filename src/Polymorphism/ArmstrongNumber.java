package Polymorphism;

public class ArmstrongNumber {

    public static void printArmstrong(int low,int high){
        for (int i=low; i<high;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int number){

        int temp = number;
        int nod = countOfDigit(number);
        int sum=0;
        while(temp > 0){

            int lastDigit = temp%10;
            sum += Math.pow(lastDigit,nod);
            temp /=10;
        }
        return number == sum;

    }
    public static int countOfDigit(int n){
        int count=0;
        while(n > 0){
            int last = n%10;
            count++;
            n/=10;
        }
        return  count;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(370));
        printArmstrong(100,500);

    }
}
