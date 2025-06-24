package Arrays;

import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args) {


        ArrayList <Integer> arr = new ArrayList<>();
        ArrayList <String> arr2 = new ArrayList<>();


//        adding the elements
        arr.add(1);
        arr.add(2);
        arr.add(3);

        System.out.println(arr);


        arr.set(0,4);
        arr.addFirst(1);
        arr.remove(1);
        System.out.println(arr);


    }
}
