package String;
import java.util.*;
public class Reverse_Word_in_String {
    public static String reverseWords(String s) {
        s = s.trim();

        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);

        return String.join(" ", wordList);

    }

    public static void main(String[] args) {


    String  s = "the sky is blue";
        System.out.println(reverseWords(s));

}
}
