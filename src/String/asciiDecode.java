package String;

public class asciiDecode {

    public static void main(String[] args){
            //       0123
        String str= "cdEfG";
//        if index is odd then return previous char
//        if index is even add one to char
        StringBuilder sb= new StringBuilder(str);
        for(int i=0;i<str.length();i++){

            if(i%2==0){
                sb.setCharAt(i,(char)(str.charAt(i)+1));
            }else{
                sb.setCharAt(i,(char)(str.charAt(i)-1));
            }
        }
        System.out.println(sb);

    }
}
