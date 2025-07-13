package String;

public class StringBuilderDemo {

    public static void main(String[] args) {
        String str = "madam";

        StringBuilder strb = new StringBuilder(str);
        System.out.println(strb);

        strb.append("s");
        strb.insert(0,'z');
        strb.insert(2,'s');
        strb.delete(0,1);
        strb.setCharAt(0,'f');
        System.out.println(strb);
        System.out.println(strb.toString());
    }
}
