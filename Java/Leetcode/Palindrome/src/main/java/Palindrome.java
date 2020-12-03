public class Palindrome {
    public static void main(String[] args){
        System.out.println("IS Palindrome?? "+isPalindrome(10));
    }
    public static boolean isPalindrome(int x){
        int intialInput = x;
        int reverseNum = 0;
        if(x>0){
            while(x!=0){
                reverseNum = reverseNum * 10 + (x%10);
                x = x/10;
            }
            if(reverseNum == intialInput){
                return true;
            }
            return false;
        }
        return false;
    }
}
