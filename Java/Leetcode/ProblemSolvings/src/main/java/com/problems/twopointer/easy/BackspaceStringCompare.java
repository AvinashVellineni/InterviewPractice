package com.problems.twopointer.easy;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args){
        System.out.println(backspaceCompare("a#c","b"));
    }

    public static boolean backspaceCompare(String S, String T) {

        Stack first = new Stack();
        Stack second = new Stack();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) != '#'){
                first.push(S.charAt(i));
            }else {
                if(first.size()>0){
                    first.pop();
                }
            }
        }
        for(int i=0;i<T.length();i++){
            if(T.charAt(i) != '#'){
                second.push(T.charAt(i));
            }else {
                if(second.size()>0){
                    second.pop();
                }
            }
        }

        if(first.size() != second.size()){
            return false;
        }
        while(first.size()>0 && second.size()>0){
            if(first.pop() != second.pop()){
                return false;
            }
        }
        return true;
    }
}
