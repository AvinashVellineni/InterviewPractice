public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] strs = {"dog","racecar","car"};
        System.out.println("LongestCommonPrefix: "+getLongestCommonPrefix(strs));
    }
    public static String getLongestCommonPrefix(String[] strs){
        String prefix = "";
        if(strs.length>0){
            prefix = strs[0];
        }else {
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        while(prefix.length() >0){
            boolean prefixSatisfied = false;
            for(int i=1;i<strs.length;i++){
                if(strs[i].startsWith(prefix)){
                    prefixSatisfied = true;
                    continue;
                }else{
                    prefixSatisfied = false;
                    break;
                }
            }
            if(prefixSatisfied){
                return prefix;
            }
            prefix = prefix.substring(0,prefix.length()-1);
        }
        return "";
    }

}
