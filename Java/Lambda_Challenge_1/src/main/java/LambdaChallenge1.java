import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaChallenge1 {
    public static void main(String[] args){

        //First challenge to implement runnable
        Runnable r = () -> {
            String myString = "Hello Avinash";
            String[] stringArr = myString.split(" ");
            for(String s : stringArr){
                System.out.println(s);
            }
        };
        r.run();

        //Second get every second character
        Predicate<Integer> predicate = (i) -> i%2==1;

        Function<String,String> func = s -> {
            StringBuilder retVal = new StringBuilder();
            for(int i=0; i<s.length();i++){
                if(predicate.test(i)){
                    retVal.append(s.charAt(i));
                }
            }
            return retVal.toString();
        };

        Consumer<String> consumer = (c) -> System.out.println(everySecondCharacter(func,c));
        consumer.accept("1234567890");

        //Create supplier to return iLovejava
        Supplier<String> supplier = () -> {
            return "I love Java!";
        };
        System.out.println(supplier.get());

    }

    public static String everySecondCharacter(Function<String,String> func, String source){
        return func.apply(source);
    }
}
