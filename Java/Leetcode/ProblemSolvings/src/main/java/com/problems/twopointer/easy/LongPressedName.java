package com.problems.twopointer.easy;

public class LongPressedName {
    public static void main(String[] args){
        System.out.println(isLongPressedName("leelee","lleeelee"));
    }
    public static boolean isLongPressedName(String name, String typed) {
        int nameLength = name.length() -1;
        int typedLength = typed.length()-1;
        if(typed.charAt(typedLength) != name.charAt(nameLength)){
            return false;
        }else {
            nameLength--;
            typedLength--;
        }
        while(nameLength>=0 && typedLength>=0){
            if(typed.charAt(typedLength) == name.charAt(nameLength)){
                nameLength--;
                typedLength--;
            }else {
                if(typed.charAt(typedLength) == typed.charAt(typedLength+1)){
                    typedLength--;
                }else {
                    return false;
                }
            }
        }
        if(nameLength>=0){
            return false;
        }else if(nameLength<0 && typedLength<0){
            return true;
        }else {
            while(typedLength>=0){
                if(typed.charAt(typedLength) == typed.charAt(typedLength+1)){
                    typedLength--;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
