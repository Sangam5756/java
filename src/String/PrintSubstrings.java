package String;

public class PrintSubstrings
{
    public static void subString(String str){
        for(int si=0; si<str.length(); si++){
            for(int ei=si+1; ei<=str.length();ei++){
                System.out.println(str.substring(si,ei));
            }
        }
    }

    public static void main(String []args){
        subString("sangam");
    }
}
