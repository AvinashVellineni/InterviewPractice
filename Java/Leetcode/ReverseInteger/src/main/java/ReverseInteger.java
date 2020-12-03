public class ReverseInteger {
    public static void main(String[] args){
        System.out.println("REVERSE NUMBER: "+anotherReverse(120));
    }
    public static int reverse(int x){
        int reversenum =0;
        if(x<0){
            x = x*-1;
            while(x/10 >0){
                reversenum = reversenum * 10 + (x%10);
                x = x/10;
            }
            return -1*(reversenum* 10 + (x%10));
        }else if(x>0){
            while(x/10 >0){
                reversenum = reversenum * 10 + (x%10);
                x = x/10;
            }
            return reversenum* 10 + (x%10);
        }
        return reversenum;
    }
    public static int anotherReverse(int x){
        int reversenum =0;
        if(x<0){
            x = x*-1;
            while(x!=0){
                reversenum = reversenum * 10 + (x%10);
                x = x/10;
            }
            return -1*reversenum;
        }else if(x>0){
            while(x!=0){
                reversenum = reversenum * 10 + (x%10);
                x = x/10;
            }
            return reversenum;
        }
        return reversenum;
    }
}
