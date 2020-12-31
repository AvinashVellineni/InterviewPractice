import java.util.*;

public class ValidParentheses {
    public static void main(String[] args){
        String s = "{[]}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        String[] arrayOfStrings = s.split("");
        if(arrayOfStrings.length % 2 !=0){
            return false;
        }
        Map<String,String> map = new HashMap<>();
        map.put("(",")");
        map.put("{","}");
        map.put("[","]");
        Stack<String> temeroryValues = new Stack<>();
        for(int i=0; i<arrayOfStrings.length; i++){
            if(map.containsKey(arrayOfStrings[i])){
                temeroryValues.add(arrayOfStrings[i]);
            }else {
                if(temeroryValues.size() != 0 && map.get(temeroryValues.pop()).equals(arrayOfStrings[i])){
                    continue;
                }else {
                    return false;
                }
            }
        }
        if(temeroryValues.size() == 0){
            return true;
        }
        return false;
    }
}
