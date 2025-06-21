package Basics;

public class Typecasting {
    public static void main(String[] args) {

        //Widening Casting (int to double)
        int intVal = 10;
        double doubleVal = intVal;  // Implicit cast
        System.out.println("Widening: int " + intVal + " → double " + doubleVal);

        // Narrowing Casting (double to int)
        double originalDouble = 9.99;
        int narrowedInt = (int) originalDouble;  // Explicit cast
        System.out.println("Narrowing: double " + originalDouble + " → int " + narrowedInt);

        //char to int (ASCII conversion)
        char charVal = 'A';
        int ascii = charVal;
        System.out.println("Char to Int: '" + charVal + "' → " + ascii);

        // int to char (ASCII to char)
        int num = 66;
        char charFromNum = (char) num;
        System.out.println("Int to Char: " + num + " → '" + charFromNum + "'");

        // Data loss in narrowing (int to byte)
        int bigInt = 130;
        byte smallByte = (byte) bigInt;  // Byte range: -128 to 127
        System.out.println("Data Loss (int to byte): " + bigInt + " → " + smallByte);


    }

}
