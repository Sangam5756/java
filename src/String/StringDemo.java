package String;
import java.util.*;
public class StringDemo {

    public static void main(String[] args){


    String firstName = "Sangam";
    String lastName="Mundhe";
    //    String fullName = name.concat(firstName+lastName);
        String fullName = firstName.concat(lastName);
        System.out.println(fullName);

//   string manipulation
        String str = new String("newString");
        System.out.println(str);
        String str2 = new String("newString");
//        it will alway false as the string creation with new keyword make new object in heap memory
//        so its checking reference not actual value
        System.out.println(str == str2);

//      this below code demonstrate the reference in java as when we create the String with string as it goes to constant pools
//        and same string we try to create with different name but actual value is same so java points the name2 to name1 internally
//        thats why we get the true but with new keyword we get false .
        String name1="sangam";
        String name2="sangam";
        System.out.println(name1==name2); //true
        System.out.println(name1.equals(name2));//true

//        but with new keyword
        System.out.println(str ==str2); //false
        System.out.println(str.equals(str2));//true

//        String is immutables
        String newStr="sangam";
        newStr = newStr.concat("mundhe");
        System.out.println(newStr);

//        String accessing
        String hello = "Hello Worlds";

        char ch = hello.charAt(0);
        System.out.println(hello.charAt(hello.length()-1));

//        substring
        System.out.println(hello.substring(1,4));
        System.out.println(hello.substring(1));
        System.out.println(hello.lastIndexOf('e'));
        System.out.println(hello.startsWith("he")); //casesensitive
        System.out.println(hello.endsWith("s")); //casesensitive


}
}
