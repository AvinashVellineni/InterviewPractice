public class StrtStr {
    public static void main(String[] args){
        System.out.println(strStr("hello","ll"));
    }
    public static int strStr(String haystack, String needle) {

        if(needle.length() == 0){
            return 0;
        }
        if(haystack.contains((needle))){
            for(int i=0; i<=haystack.length()-needle.length();i++){
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
