package String;

public class largest_substring_between_two_equal_characters {
    public static int maxLengthBetweenEqualCharacters(String s) {
        int[] indices = new int[26];
        int maxLen =-1;

        for(int i=0; i<s.length();i++){
            int idx =s.charAt(i) - 'a';

            if(indices[idx] >0){
                // we are seeing repeated character
                maxLen =Math.max(maxLen,i-indices[idx]);
            }else{
                // seeing for the first time
                indices[idx] =i+1;
            }

        }
        return maxLen;
    }
    public static void main(String[]args){
        String s = "abca";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }
}
