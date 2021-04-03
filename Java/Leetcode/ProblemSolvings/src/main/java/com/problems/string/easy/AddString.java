package com.problems.string.easy;

public class AddString {
    public static void main(String[] args){
        System.out.println(addStrings("401716832807512840963","167141802233061013023557397451289113296441069"));
    }
    public static String addStrings(String num1, String num2) {
        StringBuilder builder = new StringBuilder();
        int length1 = num1.length()-1;
        int length2 = num2.length()-1;
        int carry = 0;
        while(length1>=0 && length2>=0){
            int temp = Integer.parseInt(num1.charAt(length1)+"") + Integer.parseInt(num2.charAt(length2)+"") + carry;
            if(temp>9){
                builder.append(temp%10);
                carry = temp/10;
            }else {
                builder.append(temp%10);
                carry = 0;
            }
            length1--;
            length2--;
        }

        while (length2>=0){
            int temp = Integer.parseInt(num2.charAt(length2)+"") + carry;
            if(temp>9){
                builder.append(temp%10);
                carry = temp/10;
            }else {
                builder.append(temp%10);
                carry = 0;
            }
            length2--;
        }
        while (length1>=0){
            int temp = Integer.parseInt(num1.charAt(length1)+"") + carry;
            if(temp>9){
                builder.append(temp%10);
                carry = temp/10;
            }else {
                builder.append(temp%10);
                carry = 0;
            }
            length1--;
        }
        if(carry>0){
            builder.append(carry);
        }
        return builder.reverse().toString();
    }
}
